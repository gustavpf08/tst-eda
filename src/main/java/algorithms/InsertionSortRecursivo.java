package algorithms;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        int[] array = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            insertionSortRecursivo(array, i);
            System.out.println(Arrays.toString(array));
        }
    }

    private static void insertionSortRecursivo(int[] array, int inicio) {
        if (inicio <= 0 || array[inicio - 1] <= array[inicio])
            return;

        if (array[inicio - 1] > array[inicio])
            swap(array, inicio);

        insertionSortRecursivo(array, --inicio);
    }

    private static void swap(int[] array, int pos) {
        int aux = array[pos];
        array[pos] = array[pos - 1];
        array[pos - 1] = aux;
    }
}
