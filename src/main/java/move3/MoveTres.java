package move3;

import java.util.Arrays;
import java.util.Scanner;

class MoveTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] numbers = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        findingDesorder(numbers);
    }

    private static void findingDesorder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            swapingElements(numbers, i);
        }
    }

    private static void swapingElements(int[] numbers, int i) {
        while(numbers[i + 1] < numbers[i]) {
            int aux = numbers[i + 1];
            numbers[i + 1] = numbers[i];
            numbers[i] = aux;
            i--;

            System.out.println(Arrays.toString(numbers));
        }
    }
}