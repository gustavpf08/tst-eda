package posicoes_de_um_elemento_em_sequencia;

import java.util.Arrays;
import java.util.Scanner;

class PosicoesElementSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = Integer.parseInt(sc.nextLine());
        String numbers = sc.nextLine();

        int[] list = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String out = findingValues(list, value);
        if (out.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(out.trim());
        }
    }

    private static String findingValues(int[] list, int value) {
        String out = "";
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) out += i + " ";
        }
        return out;
    }
}
