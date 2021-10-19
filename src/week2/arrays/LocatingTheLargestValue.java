package week2.arrays;

import java.util.Arrays;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        StringBuilder str = new StringBuilder("Array: ");
        for (int num : arr) {
            str.append(num).append(" ");
        }

        System.out.printf("""
                %s
                
                The largest value is %d
                It is in slot %d
                """, str, max, maxIndex);

    }
}
