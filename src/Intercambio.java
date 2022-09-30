public class Intercambio {
    public static int[] IntercambioClass(int[] array) {
        int aux; //apoyo para hacer los intercambios
        System.out.println("");
        System.out.println("-----Intercambio-----");
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        ordenacionMain.ArrayImp(array); //Imprimir array
        System.out.println("-----Intercambio Fin-----");

        return array;
    }



}
