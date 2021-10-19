package week2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            Random random = new Random();
            arr1[i] = random.nextInt(50);
        }

        StringBuilder str = new StringBuilder("Array: ");
        for (int num : arr1) {
            str.append(num).append(" ");
        }

        System.out.printf("""
                %s
                Value to find:\040
                """, str);

        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());

        if (Arrays.stream(arr1).anyMatch(n -> n == userInput)) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == userInput) {
                    System.out.printf("\n%d is in slot %d.", arr1[i], i);
                }
            }
        } else {
            System.out.println(userInput + " is not in the array.");
        }

    }

}
