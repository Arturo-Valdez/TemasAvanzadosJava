import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31");
        persona.put("edad", "31");//No se permiten duplicados

        System.out.println("Valores del mapa");
        persona.entrySet().forEach(System.out::println);

        System.out.println("\nNuevos valores del mapa");
        persona.put("edad", "25");//Modificar valor de key: edad
        persona.entrySet().forEach(System.out::println);

        persona.remove("apellido");//Eliminacion de valor
        System.out.println("\nNuevos valores del mapa");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nInterar los elementos (llave, valor)");
        persona.forEach((llave, valor) -> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });
    }
}
