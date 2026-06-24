package interpretes;

import java.io.IOException;

import webots.WebotsTractorAPI;

public class InterpreteWebots {
    public static void main(String[] args) throws IOException {

        Interprete interprete = new Interprete(new WebotsTractorAPI());

        if (args.length > 0) {
            interprete.ejecutarPrograma(args[0]);
        } else {
            System.out.println("Modo consola PLATA.");
            System.out.println("Escribe el programa y pulsa Ctrl+Z luego Enter para ejecutar.");
            interprete.ejecutarDesdeConsola();
        }

    }
}