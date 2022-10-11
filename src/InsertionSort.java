public class InsertionSort {
    public static int[] InsertionClass(int[] array){
        int key; //Llave para realizr las comparaciones
        int aux;
        System.out.println("");
        System.out.println("-----InsertionSort-----");
        for (int i = 0; i < array.length; i++){
            key = i + 1;
            for (; i >= 0; i--){
                if (array[i] > array[key]){
                    aux = array[i];
                    array[i] = array[key];
                    array[key] = aux;
                }
            }
        }
        ordenacionMain.ArrayImp(array);
        System.out.println("-----InsertionSort Fin-----");

        return array;
    }
}
