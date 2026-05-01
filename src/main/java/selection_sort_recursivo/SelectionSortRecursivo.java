package selection_sort_recursivo;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        selectionSort(array);
    }

    private static void selectionSort(int[]array) {
        selectionSortRecursivo(array, 0);
    }

    private static void selectionSortRecursivo(int[] array, int inicio) {
        if (inicio >= array.length - 1)
            return;

        int pos = inicio, menor = inicio;
        for (int i = pos + 1; i < array.length; i++) {
            if (array[i] < array[menor])
                menor = i;
        }
        swap(array, menor, pos);
        selectionSortRecursivo(array, ++inicio);
    }

    private static void swap(int[] array, int menor, int pos) {
       int aux = array[menor];
       array[menor] = array[pos];
       array[pos] = aux;
       System.out.println(Arrays.toString(array));
    }
}