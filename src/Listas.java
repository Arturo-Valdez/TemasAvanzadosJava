import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Generar lista - Uso de generico picoparentesis para especificar los
        //Elementos de la lista
        List<String> milista = new ArrayList<>();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Sabado");
        milista.add("Domingo");
        //milista.add("Domingo");

        //Uso de forEach
        for(String elemento : milista){
            System.out.println("Dia de la semana: " + elemento);
        }
        System.out.println();
        //Funciones lambda (Funciones anonimas de un codigo muy compacto)
        milista.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });
    }
}
