package mariana_e_os_livros;

import java.util.Scanner;

class MarianaInsertionSortLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] livros = sc.nextLine().split(",");
        insertionSort(livros);
    }

    private static void insertionSort(String[] livros) {
        System.out.println(String.join(", ", livros));
        for (int i = 0; i < livros.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (livros[j].compareTo(livros[j - 1]) < 0) {
                    swap(livros, j);
                }
            }
            System.out.println(String.join(", ", livros));
        }
    }

    private static void swap(String[] livros, int j) {
        String aux = livros[j - 1];
        livros[j - 1] = livros[j];
        livros[j] = aux;
    }
}
