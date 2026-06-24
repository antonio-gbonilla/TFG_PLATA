package plata;

/**
 * Excepción específica del lenguaje PLATA.
 * <p>
 * Esta clase representa los errores semánticos o de ejecución que pueden
 * producirse durante la interpretación de programas escritos en el lenguaje.
 * <p>
 * Se utiliza principalmente en el visitor para señalar situaciones como:
 * <ul>
 *   <li>Uso incorrecto de tipos (por ejemplo, usar un número como booleano)</li>
 *   <li>Variables no definidas</li>
 *   <li>Operaciones no válidas</li>
 * </ul>
 *
 * <p>
 * Extiende de {@link RuntimeException}, por lo que no es necesario declarar
 * explícitamente su lanzamiento.
 *
 * @author Antonio Luis Gordillo Bonilla
 * @project PLATA - TFG (Ingeniería Telemática)
 * @department DTE
 */
public class PLATAException extends RuntimeException {

    /**
     * Construye una nueva excepción de PLATA con un mensaje descriptivo.
     *
     * @param message descripción del error ocurrido
     */
    public PLATAException(String message) {
        super(message);
    }
}