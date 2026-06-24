package webots;

/**
 * Conjunto de utilidades matemáticas orientadas a la navegación y movimiento
 * en el espacio tridimensional.
 * <p>
 * Esta clase proporciona operaciones básicas necesarias para el control
 * del tractor autónomo en la simulación, como:
 * <ul>
 * <li>Normalización de ángulos</li>
 * <li>Cálculo de distancias entre puntos</li>
 * <li>Cálculo del ángulo hacia un objetivo</li>
 * </ul>
 * 
 * <p>
 * Todas las funciones son estáticas y la clase no puede instanciarse.
 * 
 * @author Antonio Luis Gordillo Bonilla
 * @project PLATA - TFG (Ingeniería Telemática)
 * @department DTE
 */
public class UtilidadesNavegacion {

    /**
     * Constructor privado para evitar la instanciación de la clase.
     * <p>
     * Esta clase está diseñada como un contenedor de métodos estáticos.
     */
    private UtilidadesNavegacion() {
        // Constructor privado para evitar instanciación
    }

    /**
     * Normaliza un ángulo al rango {@code [-π, π)}.
     * <p>
     * Este método permite trabajar con ángulos equivalentes evitando
     * discontinuidades debidas a múltiples vueltas completas.
     *
     * @param angle ángulo en radianes
     * @return ángulo normalizado en el rango {@code [-π, π)}
     */
    public static double normalizarAngulo(double angle) {
        while (angle >= Math.PI)
            angle -= 2.0 * Math.PI;
        while (angle < -Math.PI)
            angle += 2.0 * Math.PI;
        return angle;
    }

    /**
     * Calcula la distancia euclídea entre dos puntos en el plano X-Y.
     * <p>
     * La coordenada Z no interviene en el cálculo, ya que el desplazamiento
     * del tractor en esta simulación se controla sobre el plano X-Y.
     *
     * @param start punto inicial representado como {@code [x, y, z]}
     * @param end   punto final representado como {@code [x, y, z]}
     * @return distancia entre ambos puntos en el plano X-Y
     */
    public static double distancia(double[] start, double[] end) {
        double x2 = (start[0] - end[0]) * (start[0] - end[0]);
        double y2 = (start[1] - end[1]) * (start[1] - end[1]);
        return Math.sqrt(x2 + y2);
    }

    /**
     * Calcula el ángulo necesario para orientar el tractor desde su posición
     * actual hacia una posición objetivo en el plano X-Y.
     * <p>
     * Obtiene la diferencia entre las coordenadas X e Y de la
     * posición actual y la posición objetivo, y utiliza la función
     * {@link Math#atan2(double, double)} para calcular el ángulo teniendo en
     * cuenta el cuadrante correspondiente.
     *
     * @param posicionActual   posición actual del tractor representada como
     *                         {@code [x, y, z]}
     * @param posicionObjetivo posición objetivo representada como {@code [x, y, z]}
     * @return ángulo hacia la posición objetivo en radianes
     */
    public static double rumboHaciaObjetivoXY(double[] posicionActual, double[] posicionObjetivo) {
        double dx = posicionObjetivo[0] - posicionActual[0];
        double dy = posicionObjetivo[1] - posicionActual[1];
        return Math.atan2(dy, dx);
    }
}