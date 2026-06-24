package interpretes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import plata.TractorAPI;
import plata.MiVisitor;
import plata.*;
public class Interprete {

    private TractorAPI tractorAPI;

    public Interprete(TractorAPI tractorAPI) {
        this.tractorAPI = tractorAPI;
    }

    public void ejecutarPrograma(String rutaPrograma) throws IOException {
        CharStream input = CharStreams.fromFileName(rutaPrograma, StandardCharsets.UTF_8);
        ejecutar(input);
    }

    public void ejecutarDesdeConsola() throws IOException {
        CharStream input = CharStreams.fromStream(System.in, StandardCharsets.UTF_8);
        ejecutar(input);
    }

    private void ejecutar(CharStream input) {
        PLATALexer lexer = new PLATALexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        PLATAParser parser = new PLATAParser(tokens);
        ParseTree tree = parser.programa();

        MiVisitor visitor = new MiVisitor(tractorAPI);
        visitor.visit(tree);
    }
}
