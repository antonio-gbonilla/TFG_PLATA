package interpretes;

import java.io.IOException;

import consola.ConsoleTractorAPI;

public class InterpreteConsola {
    public static void main(String[] args) throws IOException {

        Interprete interprete = new Interprete(new ConsoleTractorAPI());

        if (args.length > 0) {
            interprete.ejecutarPrograma(args[0]);
        } else {
            System.out.println("Modo consola PLATA.");
            System.out.println("Escribe el programa y pulsa Ctrl+Z luego Enter para ejecutar.");
            interprete.ejecutarDesdeConsola();
        }

    }

}