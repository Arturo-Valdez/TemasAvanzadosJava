package maquina_snack_archivos.servicio;

import maquina_snack_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks{
    private static final List<Snack> snacks;

//    bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 20));
        snacks.add(new Snack("Refresco", 25));
        snacks.add(new Snack("Torta", 80));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public void mostrarSacks(){
        var inventarioSnack = "";
        for(var snack : snacks){
            inventarioSnack += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnack);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }


}
