import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //Set evita cadenas duplicadas
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Aleman");
        conjunto.add("Español");
        conjunto.add("Mexicano");
        conjunto.add("Mexicano");
        conjunto.add("Ruso");

        //Imprecion de elementos no duplicados con lamdba
        System.out.println("Elementos Set:");
        conjunto.forEach(System.out::println);

        //Remove - elimina elemento
        conjunto.remove("Aleman");
        System.out.println("\nNuevos Elementos del Set:");
        conjunto.forEach(System.out::println);
    }
}
