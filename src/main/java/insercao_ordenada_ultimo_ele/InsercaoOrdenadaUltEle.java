package insercao_ordenada_ultimo_ele;

import java.util.Arrays;
import java.util.Scanner;

class InsercaoOrdenadaUltEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        insercao_ordenada_por_ultimo(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insercao_ordenada_por_ultimo(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] <= array[i - 1]) {
                swap(array, i);
            }
        }
    }

    private static void swap(int[] array, int i) {
        int aux = array[i - 1];
        array[i - 1] = array[i];
        array[i] = aux;
    }
}
