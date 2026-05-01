package vetor_circular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VetorCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nums = sc.nextLine().split(" ");
        int qntd = Integer.parseInt(sc.nextLine());

        List<String> vetorCircular = new ArrayList<>();

        int i = 0;
        while (vetorCircular.size() != qntd) {
           vetorCircular.add(nums[i]);
           i++;
            if (i == nums.length) i = 0;
        }

        System.out.println(String.join(" ", vetorCircular));
    }
}
