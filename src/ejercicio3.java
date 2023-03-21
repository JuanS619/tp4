import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.nio.charset.StandardCharsets;

public class ejercicio3 {
    public static void main(String[] args) throws IOException {
        Path ruta = Paths.get("c:\\Users\\Juan\\Desktop\\java-argentina-programa\\3. tareas-codigos\\tp4\\ejercicio3.txt");
        Files.write(ruta, "Juan;\nEuclides;\n".getBytes());
        //esta parte recorre el archivo para leer el contenido de adentro
        List < String > ContenidoArchivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
        ContenidoArchivo.forEach(line -> System.out.println(line));


    }
}
