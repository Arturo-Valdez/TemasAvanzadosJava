public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5,10,30,45};

        //Metodo forEach imprecion de valores sin uso de indice
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
    }
}
