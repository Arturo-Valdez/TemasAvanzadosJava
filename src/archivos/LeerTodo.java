package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "Mi_Archivo.txt";
        try{
            //Leer lineas de archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            lineas.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
