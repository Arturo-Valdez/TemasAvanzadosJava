public class BuscaValorFaltante {
    public static void main(String[] args) {
        var faltante = 1;
        int[] numeros= new int[4];
        numeros[0] = 4;
        numeros[1] = 1;
        numeros[2] = 5;
        numeros[3] = 2;

        for (int i = 0; i <numeros.length ; i++) {
            for (int j = 0; j < numeros.length ; j++) {
                if(numeros[i] == faltante){
                    faltante++;
                    break;
                }

            }

        }
        System.out.println(faltante);
    }
}
