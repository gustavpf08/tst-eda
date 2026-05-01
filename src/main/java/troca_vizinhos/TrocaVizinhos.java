package troca_vizinhos;

import java.util.Arrays;
import java.util.Scanner;

public class TrocaVizinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = sc.nextLine().split(" ");
        if (list.length == 1) {
            System.out.println(Arrays.toString(list));
            return;
        }

        int tam = list.length / 2;
        for (int i = 0; i <= tam; i += 2){
            String aux = list[i];
            list[i] = list[i + 1];
            list[i + 1] = aux;
        }

        System.out.println(Arrays.toString(list));
    }
}
