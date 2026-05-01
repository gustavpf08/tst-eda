package n3_mais1;

import java.util.Scanner;

class TresNMaisUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        int qntdMax = 0;
        while (true) {
            int operacoes = verificaQntdOperacoes(num1);
            if (operacoes > qntdMax) {
                qntdMax = operacoes;
            }
            if (num1 == num2) break;
            num1++;
        }
        System.out.println(qntdMax + 1);
    }

    private static int verificaQntdOperacoes(int value) {
        int operacoes = 0;
        while (true) {
            if (value == 1) {
                break;
            } else if (value % 2 == 0) {
                value /= 2;
                operacoes++;
            } else {
                value = value * 3 + 1;
                operacoes++;
            }
        }
        return operacoes;
    }
}
