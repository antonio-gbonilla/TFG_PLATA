package plata;

/**
 * Representa un valor genérico dentro del lenguaje PLATA.
 * <p>
 * Esta clase encapsula un valor interno que puede ser de distintos tipos
 * (por ejemplo, {@link Double}, {@link Boolean}, {@link String}), y proporciona
 * métodos para acceder a dicho valor de forma tipada.
 * <p>
 * Se utiliza como tipo de retorno en el visitor del intérprete para manejar
 * los resultados de expresiones y operaciones del lenguaje.
 *
 * <p>
 * Además, incluye utilidades para comprobar el tipo del valor y convertirlo
 * al tipo esperado en tiempo de ejecución.
 *
 * <p>
 * Existe una instancia especial {@code VACIO} que representa la ausencia de valor,
 * utilizada en instrucciones que no devuelven resultado.
 *
 * @author Antonio Luis Gordillo Bonilla
 * @project PLATA - TFG (Ingeniería Telemática)
 * @department DTE
 */
public class Valor {

    /**
     * Instancia especial que representa un valor vacío.
     * <p>
     * Se utiliza como valor de retorno en instrucciones que no producen
     * resultado (por ejemplo, acciones del tractor).
     */
    public static Valor VACIO = new Valor(new Object());

    /**
     * Valor interno encapsulado.
     * <p>
     * Puede ser de tipo {@link Double}, {@link Boolean}, {@link String}
     * u otros tipos según la semántica del lenguaje.
     */
    final Object valor;

    /**
     * Construye un objeto {@code Valor} que encapsula el valor indicado.
     *
     * @param valor valor interno a almacenar
     */
    public Valor(Object valor) {
        this.valor = valor;
    }

    /**
     * Devuelve el valor interno como booleano.
     *
     * @return valor booleano
     * @throws PLATAException si el valor no es de tipo {@link Boolean}
     */
    public Boolean asBoolean() {
        if (!isBoolean()) {
            throw new PLATAException("No se puede usar " + valor + " como booleano");
        }
        return (Boolean) valor;
    }

    /**
     * Devuelve el valor interno como número en coma flotante.
     *
     * @return valor numérico como {@link Double}
     * @throws ClassCastException si el valor no es de tipo {@link Double}
     */
    public Double asDouble() {
        return (Double) valor;
    }

    /**
     * Devuelve el valor interno como cadena de texto.
     * <p>
     * Este método siempre devuelve un resultado, independientemente del tipo
     * interno del valor.
     *
     * @return representación en cadena del valor
     */
    public String asString() {
        return String.valueOf(valor);
    }

    /**
     * Indica si el valor interno es de tipo {@link Double}.
     *
     * @return {@code true} si es un número, {@code false} en caso contrario
     */
    public boolean isDouble() {
        return valor instanceof Double;
    }

    /**
     * Indica si el valor interno es de tipo {@link String}.
     *
     * @return {@code true} si es una cadena, {@code false} en caso contrario
     */
    public boolean isString() {
        return valor instanceof String;
    }

    /**
     * Indica si el valor interno es de tipo {@link Boolean}.
     *
     * @return {@code true} si es booleano, {@code false} en caso contrario
     */
    public boolean isBoolean() {
        return valor instanceof Boolean;
    }

    /**
     * Calcula el código hash del valor.
     *
     * @return código hash basado en el valor interno
     */
    @Override
    public int hashCode() {
        if (valor == null) {
            return 0;
        }
        return this.valor.hashCode();
    }

    /**
     * Compara este objeto con otro para determinar si son equivalentes.
     * <p>
     * Dos objetos {@code Valor} son iguales si contienen valores internos
     * iguales según {@link Object#equals(Object)}.
     *
     * @param o objeto a comparar
     * @return {@code true} si son iguales, {@code false} en caso contrario
     */
    @Override
    public boolean equals(Object o) {

        // Comparación por referencia
        if (valor == o) {
            return true;
        }

        // Comprobación de tipo y null
        if (valor == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        // Comparación del valor interno
        Valor that = (Valor) o;
        return this.valor.equals(that.valor);
    }

    /**
     * Devuelve una representación en cadena del valor interno.
     *
     * @return cadena representando el valor
     */
    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}