package encontra_primeiro_negativo;

import java.util.Scanner;

class EncontraPrimeiroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = sc.nextLine().split(" ");
        System.out.println(encontraRecursivo(list, 0));
    }

    private static String encontraRecursivo(String[] list, int n) {
        if (n > list.length - 1)
            return "-";

        if (Integer.parseInt(list[n]) < 0)
            return list[n];

        return encontraRecursivo(list, n + 1);
    }
}

