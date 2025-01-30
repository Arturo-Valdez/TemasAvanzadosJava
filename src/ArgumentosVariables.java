public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumeros(1,2,3,4,5,6,7,8,9,10);//varargs / argumentos Variables
        variosParametros("Karen", 10,20,30);
    }

    //Se puede agregar una variable distinta tipo String sea inicio o final,  pero no ambos
    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    //impresion de todos los valores agregados sin limite
    static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
