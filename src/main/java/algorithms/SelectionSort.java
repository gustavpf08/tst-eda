package algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 0};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            lowestIndex(array, i);
        }
    }

    private static void lowestIndex(int[] array, int i) {
        int menor_idx = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[menor_idx]) {
                menor_idx = j;
            }
        }
        swap(array, i, menor_idx);
    }

    private static void swap(int[] array, int i, int menor_idx) {
        int aux = array[menor_idx];
        array[menor_idx] = array[i];
        array[i] = aux;
    }
}
