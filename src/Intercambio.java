public class Intercambio {
    public static int[] IntercambioClass(int[] array) {
        int aux; //apoyo para hacer los intercambios
        System.out.println("");
        System.out.println("-----Intercambio-----");
        for (int i = 0; i < array.length; i++){ //Elemento inical
            for (int j = i + 1; j < array.length; j++){ //Recorre el arreglo
                if(array[i] > array[j]){ //Cambiar solo si el elemento en i resulta mayor a j (Ordenamiento ascendente)
                    aux = array[i]; //Guardamos el elemento en una variable de apoyo
                    array[i] = array[j]; //Cambiamos los elementos
                    array[j] = aux; //Guardamos el elemento i (que estaba en la vaariable de apoyo) con la posición j
                }
            }
        }
        ordenacionMain.ArrayImp(array); //Imprimir array
        System.out.println("-----Intercambio Fin-----");

        return array;
    }



}
