package Ordering;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase para generar lista de numeros aleatorios y ordenarlos
 * @version 1.0.0 2022/02/13
 * @author Ricardo Ortega
 * @since 1.0.0
 */
public class Main {

    /**
     * Clase main para ejecutar el programa
     * @param args Entrada por consola
     */
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        int[] arrayRandomNumbers;
        int typeOrdering;
        int generateArray;

        System.out.println("""
                Bienvenido
                Este programa le permite generar aleatoriamente una lista de 20 números enteros 
                y luego ordenarlos de dos maneras segun su elección""");

        do {
            System.out.println("""
                   \n ¿Generar lista de numeros aleatorios?
                    1.Si
                    2.No""");
            generateArray = option.nextInt();
            if (generateArray == 1){
                arrayRandomNumbers = generateArrayRandomNumbers();
                System.out.println("\n Lista de números \n" + Arrays.toString(arrayRandomNumbers));
                System.out.println("""
                       \n Elija el tipo de ordenamiento que desea para la lista de números:
                        1.Ordenamiento Búrbuja
                        2.Ordenamiento Quicksort""");
                typeOrdering = option.nextInt();
                if (typeOrdering == 1){
                    System.out.println("""
                            El Ordenamiento Búrbuja funciona revisando cada elemento de la lista que va a ser ordenada 
                            con el siguiente, intercambiándolos de posición si están en el orden equivocado""");
                    System.out.println("\n Lista de números aleatorios \n" + Arrays.toString(arrayRandomNumbers));
                    bubbleSort(arrayRandomNumbers);
                    System.out.println("\n Lista de números ordenada \n" + Arrays.toString(arrayRandomNumbers));
                }else {
                    System.out.println("""
                            El Ordenamiento Quicksort consiste en ir subdividiendo el array en arrays más pequeños, 
                            y ordenar éstos. Para hacer esta división, se toma un valor del array como pivote, 
                            y se mueven todos los elementos menores que este pivote a su izquierda, y los mayores 
                            a su derecha. A continuación se aplica el mismo método a cada una de las dos partes en las 
                            que queda dividido el array.""");
                    System.out.println("\n Lista de números aleatorios \n" + Arrays.toString(arrayRandomNumbers));
                    quickSort(arrayRandomNumbers, 0, arrayRandomNumbers.length -1);
                    System.out.println("\n Lista de números ordenada \n" + Arrays.toString(arrayRandomNumbers));
                }
            }else if (generateArray == 2){
                System.out.println("Programa terminado");
            }
        }while (generateArray != 2);
    }

    /**
     * Metodo para generar una lista de numeros aleatorios
     * @return Lista
     */
    public static int[] generateArrayRandomNumbers(){
        int[] arrayRandomNumbers = new int[20];
        for (int i = 0; i < 20; i ++ ){
            arrayRandomNumbers[i] = (int) (Math.random() * 100) + 1;
        }
        return arrayRandomNumbers;
    }

    /**
     * Metodo de Ordenamiento burbuja
     * @param array Lista de numeros
     */
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i ++){
            for (int j = 0; j < array.length - i - 1; j ++){
                if (array[j] > array[j + 1]){
                    int temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }
    }

    /**
     * Metodo de Ordenamiento QuickSort
     * @param array Lista de numeros
     * @param left Indice izquierdo
     * @param right Indice derecho
     */
    public static void quickSort(int[] array, int left, int right) {
        int pivot =array[left];
        int i = left;
        int j = right;
        int temporary;

        while (i < j){
            while (array[i] <= pivot && i < j){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if (i < j) {
                temporary = array[i];
                array[i] = array[j];
                array[j]= temporary;
            }
        }

        array[left] = array[j];
        array[j] = pivot;

        if (left < (j - 1)){
            quickSort(array, left, (j - 1));
        }
        if ((j + 1) < right){
            quickSort(array, (j + 1), right);
        }
    }
}
