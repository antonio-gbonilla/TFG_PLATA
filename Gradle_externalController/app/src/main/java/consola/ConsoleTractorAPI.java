package consola;

import plata.TractorAPI;

/**
 * Implementación de {@link TractorAPI} basada en consola.
 * <p>
 * Esta clase simula el comportamiento del tractor mostrando por pantalla
 * las acciones que se ejecutarían en un entorno real o en la simulación
 * de Webots.
 *
 * <p>
 * Se utiliza principalmente para depuración, pruebas sin entorno gráfico
 * y validación del flujo de ejecución de programas escritos en PLATA.
 *
 * @author Antonio Luis Gordillo Bonilla
 * @project PLATA - TFG (Ingeniería Telemática)
 * @department DTE
 */
public class ConsoleTractorAPI implements TractorAPI {

    private static final String SEPARADOR = "────────────────────────────────────────";

    /**
     * Imprime una acción del tractor con un formato común.
     *
     * @param icono icono representativo de la acción
     * @param accion nombre de la acción ejecutada
     * @param mensaje descripción de la acción
     */
    private void imprimirAccion(String icono, String accion, String mensaje) {
        System.out.println(SEPARADOR);
        System.out.println(icono + " [" + accion + "] " + mensaje);
    }

    /**
     * Formatea un número decimal para mostrarlo con dos decimales.
     *
     * @param valor valor numérico
     * @return valor formateado
     */
    private String formatear(double valor) {
        return String.format("%.2f", valor);
    }

    /**
     * Simula el avance del tractor.
     *
     * @param distancia distancia a recorrer
     * @param velocidad velocidad de avance
     */
    @Override
    public void avanzar(double distancia, double velocidad) {
        imprimirAccion(
            "🚜",
            "AVANZAR",
            "El tractor avanza " + formatear(distancia) +
            " metros a una velocidad de " + formatear(velocidad) + " m/s"
        );
    }

    /**
     * Simula el giro del tractor.
     *
     * @param angulo ángulo de giro en grados
     */
    @Override
    public void girar(double angulo) {
        imprimirAccion(
            "🔄",
            "GIRAR",
            "El tractor gira " + formatear(angulo) + " grados"
        );
    }

    /**
     * Simula el frenado del tractor.
     */
    @Override
    public void frenar() {
        imprimirAccion(
            "🛑",
            "FRENAR",
            "El tractor se detiene"
        );
    }

    /**
     * Simula un giro de 90 grados hacia la derecha.
     */
    @Override
    public void girarDerecha() {
        imprimirAccion(
            "↪️",
            "GIRAR DERECHA",
            "El tractor gira 90 grados hacia la derecha"
        );
    }

    /**
     * Simula un giro de 90 grados hacia la izquierda.
     */
    @Override
    public void girarIzquierda() {
        imprimirAccion(
            "↩️",
            "GIRAR IZQUIERDA",
            "El tractor gira 90 grados hacia la izquierda"
        );
    }

    /**
     * Simula el retroceso del tractor.
     *
     * @param distancia distancia a recorrer hacia atrás
     * @param velocidad velocidad de retroceso
     */
    @Override
    public void retroceder(double distancia, double velocidad) {
        imprimirAccion(
            "⏪",
            "RETROCEDER",
            "El tractor retrocede " + formatear(distancia) +
            " metros a una velocidad de " + formatear(velocidad) + " m/s"
        );
    }

    /**
     * Muestra un mensaje por consola.
     *
     * @param mensaje mensaje a mostrar
     */
    @Override
    public void mostrar(String mensaje) {
        imprimirAccion(
            "💬",
            "MOSTRAR",
            "\"" + mensaje + "\""
        );
    }

    /**
     * Simula el desplazamiento del tractor a una posición objetivo en el plano XY.
     *
     * @param x         coordenada X de destino
     * @param y         coordenada Y de destino
     * @param velocidad velocidad de desplazamiento
     */
    @Override
    public void irA(double x, double y, double velocidad) {
        imprimirAccion(
            "📍",
            "IR A",
            "El tractor se desplaza hasta la posición X=" + formatear(x) +
            ", Y=" + formatear(y) +
            " a una velocidad de " + formatear(velocidad) + " m/s"
        );
    }

    /**
     * Simula el establecimiento de la velocidad de crucero del tractor.
     *
     * @param velocidad nueva velocidad de crucero
     */
    @Override
    public void ajustarVelocidad(double velocidad) {
        imprimirAccion(
            "⚙️",
            "AJUSTAR_VELOCIDAD",
            "El tractor avanza a una velocidad de " + formatear(velocidad) + " m/s"
        );
    }

    /**
     * Simula la activación o desactivación del modo de arado.
     *
     * @param estado {@code true} para activar el arado, {@code false} para desactivarlo
     */
    @Override
    public void arar(boolean estado) {
        if (estado) {
            imprimirAccion(
                "⛏️",
                "ARADO",
                "Modo arado activado"
            );
        } else {
            imprimirAccion(
                "✅",
                "ARADO",
                "Modo arado desactivado"
            );
        }
    }

    @Override
    public void sembrar(boolean estado) {
        if (estado) {
            imprimirAccion(
                "🌱",
                "SEMBRAR",
                "Modo sembrado activado"
            );
        } else {
            imprimirAccion(
                "✅",
                "SEMBRAR",
                "Modo sembrado desactivado"
            );
        }
    }

    /**
     * Simula la activación o desactivación del modo de fumigación.
     *
     * @param estado {@code true} para activar la fumigación, {@code false} para desactivarla
     */
    @Override
    public void fumigar(boolean estado) {
        if (estado) {
            imprimirAccion(
                "☁️",
                "FUMIGACIÓN",
                "Modo fumigación activado"
            );
        } else {
            imprimirAccion(
                "✅",
                "FUMIGACIÓN",
                "Modo fumigación desactivado"
            );
        }
    }

    @Override
    public void regar(boolean estado) {
        if (estado) {
            imprimirAccion(
                "💧",
                "RIEGO",
                "Modo riego activado"
            );
        } else {
            imprimirAccion(
                "✅",
                "RIEGO",
                "Modo riego desactivado"
            );
        }
    }

    /**
     * Simula el envío del tractor a la posición inicial.
     */
    @Override
    public void irOrigen() {
        imprimirAccion(
            "🏁",
            "ORIGEN",
            "El tractor vuelve al punto de origen"
        );
    }

    /**
     * Simula el cambio de sentido del tractor.
     */
    @Override
    public void girarSentidoContrario() {
        imprimirAccion(
            "🔁",
            "GIRAR SENTIDO CONTRARIO",
            "El tractor gira en sentido contrario"
        );
    }
}