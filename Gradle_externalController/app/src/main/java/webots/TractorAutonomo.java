package webots;

import com.cyberbotics.webots.controller.*;
import com.cyberbotics.webots.controller.vehicle.Car;

/**
 * Clase que representa un tractor autonomo en Webots.
 * Extiende de Car y contiene metodos para controlar su movimiento.
 */

public class TractorAutonomo extends Car {

    // Tiempo que tarda en ejecutar un movimiento en webots
    private int timeStep;

    // Valor maximo para que los distance sensor indiquen que hay un obstaculo
    private static final double DISTANCIA_OBSTACULO = 2.0;

    // Velocidad maxima de los motores de las ruedas
    private static final double MAX_VELOCIDAD = 7.0;

    // Velocidad minima de los motores de las ruedas
    private static final double MIN_VELOCIDAD = -5.0;

    // Sensor de distancia del vehiculo.
    private RangeFinder rf;

    // Sensor utilizado para obtener el rumbo del tractor
    private InertialUnit rumbo;

    // lapices
    private Pen lapizArar;
    private Pen lapizFumigar;
    private Pen lapizRegar;
    private Pen lapizSembrar;

    /**
     * Proporciona las cordenadas del vehiculo
     */
    private GPS gps;

    /**
     * Constructor de TractorAutonomo.
     * Inicializa la instancia y obtiene el timeStep de la simulacion.
     */
    public TractorAutonomo() {
        super();
        timeStep = (int) getBasicTimeStep(); // Se corta la parte decima 1.9 = 1
        initSensores();
        esperar(500); // Da un tiempo para que se inicialicen los sensores.
    }

    private void initSensores() {

        // Habilitamos la rumbo
        rumbo = getInertialUnit("rumbo");
        rumbo.enable(timeStep);

        // Habilitamos el GPS
        gps = getGPS("gps");
        gps.enable(timeStep);

        // Habilitar RangeFinder
        rf = getRangeFinder("rf_front");
        rf.enable(timeStep);

        this.lapizArar = getPen("lapizArar");
        if (lapizArar == null) {
            System.out.println("No se ha encontrado el lapiz de arado");
        } else {
            lapizArar.write(false);
        }

        this.lapizFumigar = getPen("lapizFumigar");
        if (lapizFumigar == null) {
            System.out.println("No se ha encontrado el lapiz de fumigacion");
        } else {
            lapizFumigar.write(false);
        }

        this.lapizRegar = getPen("lapizRegar");
        if (lapizRegar == null) {
            System.out.println("No se ha encontrado el lapiz de fumigacion");
        } else {
            lapizRegar.write(false);
        }

        this.lapizSembrar = getPen("lapizSembrar");
        if (lapizSembrar == null) {
            System.out.println("No se ha encontrado el lapiz de sembrar");
        } else {
            lapizSembrar.write(false);
        }
    }

    public void frenar() {
        // Aplica freno al maximo
        setBrakeIntensity(1.0);
        setCruisingSpeed(0.0);
        setSteeringAngle(0.0); // ruedas rectas

        // Mantiene la simulacion unos pasos para asegurar que se detenga
        esperar(timeStep);

        // Desactiva el freno para permitir futuros movimientos
        setBrakeIntensity(0.0);
    }

    public void marchaAtrasObstaculo() {
        System.out.println("⏪ Iniciando marcha atras...");

        setSteeringAngle(0.0);
        setCruisingSpeed(-3.0); // velocidad negativa = marcha atras

        int tiempoTotal = 5000; // duracion total en ms
        int tiempoTranscurrido = 0;

        while (step(timeStep) != -1) {
            tiempoTranscurrido += timeStep;

            if (tiempoTranscurrido >= tiempoTotal) {
                break;
            }
        }

        frenar();
        System.out.println("✅ Marcha atras completada sin obstaculos.");
    }

    public void marchaAtras(double distancia, double velocidad) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser mayor que 0.");
            return;
        }

        double[] posicionInicial = gps.getValues();
        double velocidadNegativa = -Math.abs(velocidad);

        if (velocidadNegativa < MIN_VELOCIDAD) {
            velocidadNegativa = MIN_VELOCIDAD;
        }

        setSteeringAngle(0.0);
        setCruisingSpeed(velocidadNegativa);

        while (step(timeStep) != -1) {
            double[] posicionActual = gps.getValues();
            double distanciaRecorrida = UtilidadesNavegacion.distancia(posicionInicial, posicionActual);

            imprimirEstado(String.format(
                    "⏪ Distancia recorrida marcha atras: %6.2f / %6.2f m",
                    distanciaRecorrida,
                    distancia));

            if (distanciaRecorrida >= distancia) {
                break;
            }
        }
        finalizarEstado();
        frenar();
    }

    public void girar(double angle) {

        double rumboInicial = rumboActual();
        double rumboRotado = 0.0;

        double steering = (angle > 0) ? 0.5 : -0.5;
        setSteeringAngle(steering);

        final double TOLERANCIA_GIRO = Math.toRadians(0.3);

        while (step(timeStep) != -1) {
            if (hasObstaculoDelante()) {
                finalizarEstado();
                System.out.println("⚠️ Obstaculo detectado. Deteniendo el tractor...");
                frenar();
                return;
            }

            double rumboActual = rumboActual();

            double delta = UtilidadesNavegacion.normalizarAngulo(rumboActual - rumboInicial);
            rumboRotado += delta;
            rumboInicial = rumboActual;

            double anguloRestante = Math.abs(angle) - Math.abs(rumboRotado);

            if (anguloRestante > Math.toRadians(45)) {
                setCruisingSpeed(2.0);
            } else if (anguloRestante > Math.toRadians(15)) {
                setCruisingSpeed(1.0);
            } else if (anguloRestante > Math.toRadians(5)) {
                setCruisingSpeed(0.4);
            } else {
                setCruisingSpeed(0.2);
            }

            imprimirEstado(String.format(
                    "🔄 Girando: rumbo actual %6.1f° | girado %6.1f° / %6.1f° | restante %6.2f°",
                    Math.toDegrees(rumboActual),
                    Math.toDegrees(rumboRotado),
                    Math.toDegrees(angle),
                    Math.toDegrees(anguloRestante)));

            if (anguloRestante <= TOLERANCIA_GIRO) {
                break;
            }
        }

        finalizarEstado();

        setSteeringAngle(0.0);
        frenar();
        esperar(200);
    }

    private void esperar(int durationMs) {
        int steps = (int) (durationMs / timeStep); // Calcula cuantos pasos tiene que dar a partir del tiempo
        for (int i = 0; i < steps; i++) {
            if (step(timeStep) == -1)
                break; // sale del bucle for si la simulacion termina
        }
    }

    public void avanzar(double distancia, double velocidad) {
        double[] posicionInicial = gps.getValues();
        if (MAX_VELOCIDAD > velocidad && 0 < velocidad)
            setCruisingSpeed(velocidad);
        else
            setCruisingSpeed(MAX_VELOCIDAD);

        while (step(timeStep) != -1) {

            if (hasObstaculoDelante()) {
                finalizarEstado();
                System.out.println("⚠️ Obstaculo detectado. Deteniendo el tractor...");
                frenar();
                marchaAtrasObstaculo();
                return; // Sale del metodo no solo del bucle while
            }
            double[] posicionActual = gps.getValues();

            // Calcula cuanto se ha movido el robot desde su posicion inicial.
            double distanciaRecorrida = UtilidadesNavegacion.distancia(posicionInicial, posicionActual);

            imprimirEstado(String.format(
                    "🚜 Distancia recorrida: %6.1f / %6.1f m",
                    distanciaRecorrida,
                    distancia));

            if (distanciaRecorrida >= distancia) {
                break;
            }
        }
        finalizarEstado();
        frenar();
    }

    private boolean hasObstaculoDelante() {
        // 1. Lee la imagen de profundidad
        float[] profundidad = rf.getRangeImage(); // imagen de distancias
        // 2. Calcula el píxel central (frontal)
        int centro = profundidad.length / 2;

        /*
         * 3. En vez de usar solo un rayo, usa un rango:
         * center - 5 hasta center + 5 → 11 rayos.
         * 4. Si cualquiera de esos rayos ve un objeto cerca → devuelve true.
         */
        int ventana = 5; // número de píxeles a izquierda y derecha del centro
        for (int i = centro - ventana; i <= centro + ventana; i++) {
            if (profundidad[i] < DISTANCIA_OBSTACULO)
                return true;
        }
        return false;
    }

    private double rumboActual() {
        double[] rpy = rumbo.getRollPitchYaw();
        return UtilidadesNavegacion.normalizarAngulo(rpy[2]);
    }

    public void irAPosicion(double targetX, double targetY, double targetZ, double velocidad) {
        double[] posicionActual = gps.getValues();
        double[] posicionObjetivo = { targetX, targetY, targetZ };

        System.out.printf("📌 Posicion actual:   [%.2f, %.2f, %.2f]%n",
                posicionActual[0], posicionActual[1], posicionActual[2]);

        System.out.printf("🎯 Posicion objetivo: [%.2f, %.2f, %.2f]%n",
                targetX, targetY, targetZ);

        double distanciaAlObjetivo = UtilidadesNavegacion.distancia(posicionActual, posicionObjetivo);

        if (distanciaAlObjetivo < 0.3) {
            System.out.println("✅ El tractor ya esta en la posicion objetivo o muy cerca");
            return;
        }

        // 1 ª Se calcula el giro que tiene que hacer para orientar el tractor en linea
        // recta hasta el punto.
        double rumboHaciaObjetivo = UtilidadesNavegacion.rumboHaciaObjetivoXY(posicionActual, posicionObjetivo);

        System.out.printf("🧭 Angulo hacia el objetivo: %.2f radianes (%.2f grados)%n",
                rumboHaciaObjetivo,
                Math.toDegrees(rumboHaciaObjetivo));

        double rumboActual = rumboActual();

        double diferenciaAngular = UtilidadesNavegacion.normalizarAngulo(rumboActual - rumboHaciaObjetivo);

        if (Math.abs(diferenciaAngular) > 0.05) {
            girar(diferenciaAngular);
        } else {
            System.out.println("✅ El tractor ya esta orientado hacia el objetivo");
        }

        // 2º Avanzamos la distancia hacia el objetivo
        // Recalcular posición y distancia tras el giro
        posicionActual = gps.getValues();

        distanciaAlObjetivo = UtilidadesNavegacion.distancia(posicionActual, posicionObjetivo);

        avanzar(distanciaAlObjetivo, velocidad);

        // Comprobar posicion final
        posicionActual = gps.getValues();

        double distanciaFinal = UtilidadesNavegacion.distancia(posicionActual, posicionObjetivo);

        System.out.printf("📍 Posicion final:    [%.2f, %.2f, %.2f]%n",
                posicionActual[0], posicionActual[1], posicionActual[2]);

        if (distanciaFinal < 0.5) {
            System.out.println("🎯 Posicion objetivo alcanzada");
        } else {
            System.out.println("⚠️ El tractor se ha quedado cerca, pero no exactamente en la posicion objetivo");
        }
    }

    public void arar(boolean estado) {
        if (lapizArar == null)
            return;

        lapizArar.write(estado);
    }

    public void fumigar(boolean estado) {
        if (lapizFumigar == null)
            return;

        lapizFumigar.write(estado);
    }

    public void regar(boolean estado) {
        if (lapizFumigar == null)
            return;

        lapizRegar.write(estado);
    }

    public void sembrar(boolean estado) {
        if (lapizSembrar == null)
            return;

        lapizSembrar.write(estado);
    }

    private void imprimirEstado(String mensaje) {
        System.out.printf("\r%-90s", mensaje);
        System.out.flush();
    }

    private void finalizarEstado() {
        System.out.println();
    }

}
