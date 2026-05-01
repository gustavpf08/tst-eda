package bubble_passo_a_passo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class BubbleSort {
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
            boolean trocou = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                    trocou = true;
                }
            }

            if (i == 0 && !trocou) {
                System.out.println(Arrays.stream(array)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" ")));
            }

            if (!trocou) return;

            System.out.println(Arrays.stream(array)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" ")));

        }
    }

    private static void swap(int[] array, int j) {
        int aux = array[j + 1];
        array[j + 1] = array[j];
        array[j] = aux;
    }
}
