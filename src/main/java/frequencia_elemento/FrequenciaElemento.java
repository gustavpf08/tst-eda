package frequencia_elemento;

import java.util.Scanner;

class FrequenciaElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String[] lista = sc.nextLine().split(" ");

        int count = 0;
        for (String value : lista) {
            if (num.equals(value)) count++;
        }

        System.out.println(count);
    }
}
