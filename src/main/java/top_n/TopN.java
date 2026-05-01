package top_n;

import java.util.Arrays;
import java.util.Scanner;

class TopN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        int qntd = Integer.parseInt(sc.nextLine());

        int[] list = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        selectingSort(list);

        int[] listNumbers = maxNumbers(list, qntd);
        String out = "";
        for (int num : listNumbers) {
            out += num + " ";
        }

        System.out.println(out.trim());
    }
    
    private static int[] selectingSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++){
            int index_menor = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[index_menor]) {
                    index_menor = j;
                }
            }
            swap(list, i, index_menor);
        }
        return list;
    }

    private static int[] swap(int[] list, int key, int index_menor) {
        int aux = list[key];
        list[key] = list[index_menor];
        list[index_menor] = aux;
        return list;
    }

    private static int[] maxNumbers(int[] list, int qntd) {
        int[] listMaxNumbers = new int[qntd];

        int j = 0;
        for (int i = list.length - 1; i > (list.length - qntd - 1); i--) {
            listMaxNumbers[j] = list[i];
            j++;
        }
        return listMaxNumbers;
    }
}
