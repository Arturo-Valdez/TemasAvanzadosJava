import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //Generar lista
        List milista = new ArrayList();
        milista.add("Lunes");
        milista.add("Martes");
        milista.add("Miercoles");
        milista.add("Jueves");
        milista.add("Viernes");
        milista.add("Sabado");
        milista.add("Domingo");
        milista.add("Domingo");

        //Uso de forEach
        for(Object elemento : milista){
            System.out.println("Dia de la semana: " + elemento);
        }
    }
}
