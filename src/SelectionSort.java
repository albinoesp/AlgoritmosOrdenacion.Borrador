public class SelectionSort {
    public static int[] SelectionClass (int[] array) {
        int men; //menor
        int ind; //guardar la posición del menor
        int aux; //auxiliar para el intercambio de valores
        System.out.println("");
        System.out.println("-----SelectionSort-----");
        for (int i = 0; i < array.length; i++){
            men = array[i];
            ind = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < men){
                    men = array[j];
                    ind = j;
                }
            }
            aux = array[i];
            array[i] = men;
            array[ind] = aux;
        }
        ordenacionMain.ArrayImp(array); //Imprimir array
        System.out.println("-----SelectionSort Fin-----");

        return array;
    }
}
