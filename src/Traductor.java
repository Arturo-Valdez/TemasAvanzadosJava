/*
Una interface no puede ser instanciada ya que tiene
metodos abstractos
*/

public interface Traductor {
    //Publicos y abstractos
    void traducir();

    //Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando Traductor...");
    }
}

//Se utiliza el metodo implements ya que no se esta heredando con extends
class Ingles implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduciendo en Ingles...");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Ingles...");
    }
}

//Se utiliza el metodo implements ya que no se esta heredando con extends
class Frances implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduciendo en Frances...");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en Frances...");
    }
}


class PruebaTraductor{
    public static void main(String[] args) {
        //Traductor en Ingles
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        //Traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}