package maquina_snack_archivos.servicio;

import maquina_snack_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks(Snack snack);
    List<Snack> getSnack();
}
