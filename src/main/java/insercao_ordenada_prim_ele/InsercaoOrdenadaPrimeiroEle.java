package insercao_ordenada_prim_ele;

import java.util.Arrays;
import java.util.Scanner;

class InsercaoOrdenadaPrimeiroEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] array = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        insercao_ordenada_primeiro_ele(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insercao_ordenada_primeiro_ele(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
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
