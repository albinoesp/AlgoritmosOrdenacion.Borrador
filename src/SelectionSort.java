public class SelectionSort {
    public static int[] SelectionClass (int[] array) {
        int men; //menor
        int ind; //guardar la posición del menor
        int aux; //auxiliar para el intercambio de valores
        System.out.println("");
        System.out.println("-----SelectionSort-----");
        for (int i = 0; i < array.length; i++){ //Elemento i al que cambiará el valor
            men = array[i]; //No sabemos cuál es el menor, declaramos al primero como el menor
            ind = i; // Guardamos el indice del menor en el primer elemento
            for (int j = i + 1; j < array.length; j++){ // Recorrer el arreglo
                if (array[j] < men){ //Para cada elemento comparamos con el menor
                    men = array[j]; //guardar el elemento menor
                    ind = j; // Si el elemento resulta menor guardamos su posición
                }
            }
            aux = array[i]; //auxiliar para realizar el intercambio
            array[i] = men; //Cambiamos i por el menor (orden ascendente)
            array[ind] = aux; //intercambiamos el valor anterior de i con el valor menor encontrado
        }
        ordenacionMain.ArrayImp(array); //Imprimir array
        System.out.println("-----SelectionSort Fin-----");

        return array;
    }
}
