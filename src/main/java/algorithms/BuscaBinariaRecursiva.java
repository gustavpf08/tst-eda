package algorithms;

import java.util.Arrays;
import java.util.Scanner;

class BuscaBinariaRecursiva {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String lista = sc.nextLine();
       int[] array = Arrays.stream(lista.split(" ")).mapToInt(Integer::parseInt).toArray();

       int key = Integer.parseInt(sc.nextLine());

       buscaBinaria(array, 0, (array.length - 1), key);
    }

    private static int buscaBinaria(int[] array, int inicio, int fim, int key) {
        int meio = inicio + (fim - inicio) / 2;

        if (!(meio >= array.length))
            System.out.println(meio);

        if (inicio > fim) {
            System.out.println(-1);
            return -1;
        }

        if (key == array[meio])
            return meio;

        if (key > array[meio])
            return buscaBinaria(array, (meio + 1), fim, key);

        return buscaBinaria(array, inicio, (meio - 1), key);
    }
}
