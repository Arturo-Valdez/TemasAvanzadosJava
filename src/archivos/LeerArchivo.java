package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;

public class LeerArchivo {
    public static void main(String[] args) {
        //Leer el archivo
        var nombreArchivo = "Mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido de Archivo");
            //Abrir el archivo en lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            //Leemos linea a linea el archivo
            var linea = entrada.readLine();

            //Leemos todas las lineas
            while (linea != null){
                System.out.println(linea);
                //Antes de terminar ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            //Cerrar linea
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
    }
}
