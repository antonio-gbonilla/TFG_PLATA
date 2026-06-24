package plata;

public interface TractorAPI {
    void avanzar(double distancia, double velocidad);
    void ajustarVelocidad (double velocidad);
    void retroceder(double distancia, double velocidad);
    void frenar();
    void irA(double x, double z, double velocidad);
    void irOrigen();
    void girar(double angulo);
    void girarDerecha();
    void girarIzquierda();
    void girarSentidoContrario();
    void mostrar(String mensaje);
    void arar(boolean estado);
    void sembrar(boolean estado);
    void regar(boolean estado);
    void fumigar(boolean estado);
}