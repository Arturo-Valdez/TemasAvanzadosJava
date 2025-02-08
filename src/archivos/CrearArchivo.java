package archivos;

import java.io.File;
import java.io.FileWriter;//Input / Output
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Mi_Archivo.txt";
        var archivo = new File(nombreArchivo);
        try {


            if (archivo.exists()) {
                System.out.println("Archivo ya existente");
            } else {
                //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//Guarda el archivo al disco duro
                System.out.println("Se creo el archivo con exito!!");
            }
        }catch (IOException e){
            System.out.println("Error al crear archivo: " + e.getMessage());
            e.printStackTrace();//muestra toda la ruta del error
        }
    }
}
