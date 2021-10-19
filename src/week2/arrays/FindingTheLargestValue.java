package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }

        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        StringBuilder str = new StringBuilder("Array: ");
        for (int num : arr) {
            str.append(num).append(" ");
        }

        System.out.printf("""
                %s
                The largest value is %d
                """, str, max);

    }
}
