package algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{20,32,25,8,39,43,4,9,12,12};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--)
                if (array[j] < array[j - 1])
                    swap(array, j, (j - 1));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int aux = array[j];
        array[j] = array[i];
        array[i] = aux;
    }
}
