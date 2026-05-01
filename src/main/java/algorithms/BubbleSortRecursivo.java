package algorithms;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSortRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        bubbleSort(array);
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            bubbleSortRecursivo(array, i, 0);
            System.out.println(Arrays.toString(array));
        }
    }

    private static void bubbleSortRecursivo(int[] array, int pos, int inicio) {
        if (inicio >= array.length - pos - 1)
            return;

        if (array[inicio] > array[inicio + 1])
            swap(array, inicio);

        bubbleSortRecursivo(array, pos, ++inicio);
    }

    private static void swap(int[] array, int i) {
        int aux = array[i];
        array[i] = array[i + 1];
        array[i + 1] = aux;
    }
}