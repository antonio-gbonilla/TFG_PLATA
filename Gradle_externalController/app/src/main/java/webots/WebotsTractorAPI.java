package webots;

import plata.TractorAPI;

public class WebotsTractorAPI implements TractorAPI {

    private static final String SEPARADOR = "────────────────────────────────────────";

    private TractorAutonomo tractor;

    public WebotsTractorAPI() {
        tractor = new TractorAutonomo();
    }

    private void imprimirInstruccion(String icono, String instruccion) {
        System.out.println(SEPARADOR);
        System.out.println(icono + " [PLATA → WEBOTS] " + instruccion);
    }

    private String formatear(double valor) {
        return String.format("%.1f", valor);
    }

    @Override
    public void avanzar(double distancia, double velocidad) {
        imprimirInstruccion(
                "🚜",
                "avanzar(" + formatear(distancia) + ", " + formatear(velocidad) + ")");
        tractor.avanzar(distancia, velocidad);
    }

    @Override
    public void girar(double angulo) {
        imprimirInstruccion(
                "🔄",
                "girar(" + formatear(angulo) + " grados)");
        tractor.girar(Math.toRadians(angulo));
    }

    @Override
    public void frenar() {
        imprimirInstruccion(
                "🛑",
                "frenar()");
        tractor.frenar();
    }

    @Override
    public void girarDerecha() {
        imprimirInstruccion(
                "↪️",
                "girarDerecha()");
        tractor.girar(Math.toRadians(90));
    }

    @Override
    public void girarIzquierda() {
        imprimirInstruccion(
                "↩️",
                "girarIzquierda()");
        tractor.girar(Math.toRadians(-90));
    }

    @Override
    public void retroceder(double distancia, double velocidad) {
        imprimirInstruccion(
                "⏪",
                "retroceder(" + formatear(distancia) + ", " + formatear(velocidad) + ")");
        tractor.marchaAtras(distancia, velocidad);
    }

    @Override
    public void mostrar(String mensaje) {
        imprimirInstruccion(
                "💬",
                "mostrar(\"" + mensaje + "\")");
    }

    @Override
    public void irA(double x, double y, double velocidad) {
        imprimirInstruccion(
                "📍",
                "irA(x=" + formatear(x) +
                        ", y=" + formatear(y) +
                        ", velocidad=" + formatear(velocidad) + ")");
        tractor.irAPosicion(x, y, 0.609, velocidad);
    }

    @Override
    public void ajustarVelocidad(double velocidad) {
        imprimirInstruccion(
                "⚙️",
                "ajustarVelocidad(" + formatear(velocidad) + ")");
        tractor.setCruisingSpeed(velocidad);
    }

    @Override
    public void arar(boolean estado) {
        imprimirInstruccion(
                estado ? "⛏️" : "✅",
                estado ? "iniciarTarea(\"arar\")" : "finalizarTarea(\"arar\")");
        tractor.arar(estado);
    }

    @Override
    public void fumigar(boolean estado) {
        imprimirInstruccion(
                estado ? "☁️" : "✅",
                estado ? "iniciarTarea(\"fumigar\")" : "finalizarTarea(\"fumigar\")");
        tractor.fumigar(estado);
    }

    @Override
    public void regar(boolean estado) {
        imprimirInstruccion(
                estado ? "💧" : "✅",
                estado ? "iniciarTarea(\"regar\")" : "finalizarTarea(\"regar\")");
        tractor.regar(estado);
    }

    @Override
    public void sembrar(boolean estado) {
        imprimirInstruccion(
                estado ? "🌱" : "✅",
                estado ? "iniciarTarea(\"sembrar\")" : "finalizarTarea(\"sembrar\")");
        tractor.sembrar(estado);
    }


    @Override
    public void girarSentidoContrario() {
        imprimirInstruccion(
                "🔁",
                "girarSentidoContrario()");
        tractor.girar(Math.toRadians(180));
    }

    @Override
    public void irOrigen() {
        imprimirInstruccion(
                "🏁",
                "irOrigen()");
        tractor.irAPosicion(80, 23.6, 0.609, 7);
    }
}