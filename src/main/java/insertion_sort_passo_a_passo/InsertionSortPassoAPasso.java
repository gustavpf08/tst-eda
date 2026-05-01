package insertion_sort_passo_a_passo;

import java.util.Arrays;
import java.util.Scanner;

class InsertionSortPassoAPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j);
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }

    private static void swap(int[] array, int j) {
        int aux = array[j - 1];
        array[j - 1] = array[j];
        array[j] = aux;
    }
}
