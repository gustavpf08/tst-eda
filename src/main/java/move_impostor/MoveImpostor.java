package move_impostor;

import java.util.Arrays;
import java.util.Scanner;

class MoveImpostor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String list = sc.nextLine();
        int[] numbers = Arrays.stream(list.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        checkLoop(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] checkLoop(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] < numbers[i]) {
                swapElements(numbers, (i + 1));
                return numbers;
            }
        }
        return numbers;
    }

    private static int[] swapElements(int[] numbers, int index) {
        for (int i = index; i > 0; i--) {
            if (numbers[i] < numbers[i - 1]) {
                int aux = numbers[i];
                numbers[i] = numbers[i - 1];
                numbers[i - 1] = aux;
            }
        }
        return numbers;
    }
}
