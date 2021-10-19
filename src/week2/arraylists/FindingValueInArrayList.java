package week2.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            nums.add(num);
        }

        System.out.printf("""
                ArrayList: %s
                Value to find:\040
                """, nums);

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        for (int num : nums) {
            if (num == userInput) {
                System.out.printf("\n%d is in the ArrayList.", num);
            }
        }

    }
}
