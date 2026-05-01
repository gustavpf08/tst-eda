package down_n;

import java.util.Arrays;
import java.util.Scanner;

class DownN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        int qntd = Integer.parseInt(sc.nextLine());

        int[] list = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        selectionSort(list);
        System.out.println(nMenores(list, qntd).trim());
    }

    private static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int menor_idx = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[menor_idx]) {
                    menor_idx = j;
                }
            }
            swap(list, i, menor_idx);
        }
    }

    private static void swap(int[] list, int key, int menor_idx) {
        int aux = list[key];
        list[key] = list[menor_idx];
        list[menor_idx] = aux;
    }

    private static String nMenores(int[] list, int qntd) {
        String out = "";
        for (int i = 0; i < qntd; i++) {
           out += list[i] + " ";
        }
        return out;
    }
}
