//Clase main para la lista de todos los algoritmos
import java.util.*;
public class ordenacionMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
        int[] array;
        array = new int[(int)(Math.random()*(3-(10+1))+(10))];
        for (int i = 0; i < array.length; i++){
            int random = (int) (Math.random()*(0-(10+1))+(10));
            array[i] = random;
        }
        System.out.println("---Algoritmos de ordenamiento---");
        System.out.println("1. Intercambio");
        System.out.println("2. SelectionSort");
        System.out.println("3. InsertionSort");
        System.out.println("4. BubbleSort");
        System.out.println("5. ShellSort");
        System.out.println("6. MargeSort");
        System.out.println("7. QuickSort");
        System.out.println("8. RadixSort");
        System.out.println("--------------------------------");
        System.out.println("¿Qué algoritmo desea usar?");
        op = s.nextInt();
        System.out.println("Tamaño del array: " + array.length);
        ArrayImp(array); //Imprimir array
        switch (op){
            case 1: //Intercambio
                array = Intercambio.IntercambioClass(array);
                break;
            case 2: //SelectionSort
                array = SelectionSort.SelectionClass(array);
                break;
            case 3: //InsertionSort
                array = InsertionSort.InsertionClass(array);
                break;
            case 4: //BubbleSort
                break;
            case 5: //ShellSort
                break;
            case 6: //MargeSort
                break;
            case 7: //QuickSort
                break;
            case 8: //RadixSort
                break;
            default:
                System.out.println("La opción no se incluye en los algoritmos");
        }
    }

    public static void ArrayImp(int[] array){ //Imprimir array
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i != (array.length - 1))
                System.out.print(",");
        }
        System.out.print("]\n");
    }
}
