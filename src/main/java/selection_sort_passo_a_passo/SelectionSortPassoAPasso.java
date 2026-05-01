package selection_sort_passo_a_passo;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        selectionSort(array);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int menor_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[menor_idx])
                    menor_idx = j;
            }

            if (menor_idx != i) {
                swap(array, i, menor_idx);
                System.out.println(Arrays.toString(array));
            }
        }
    }

    private static void swap(int[] array, int i, int menorIdx) {
        int aux = array[menorIdx];
        array[menorIdx] = array[i];
        array[i] = aux;
    }
}
