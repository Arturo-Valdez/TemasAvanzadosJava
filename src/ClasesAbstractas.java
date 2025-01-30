public class ClasesAbstractas {
    public static void main(String[] args) {

        //Error no se puede instanciar
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

        //Uso de polimosfirmo
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

//Clase Abstracta
abstract class FiguraGeometrica{//No se puede instanciar
    public abstract void dibujar();
}

//Herencia , sobre escritura
class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se debe dibujar un Rectangulo");
    }
}
//Herencia , sobre escritura
class Circulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se debe dibujar un Circulo");
    }
}