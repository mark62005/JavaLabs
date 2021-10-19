package week2.arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();

            arr[i] = random.nextInt(100);
            System.out.printf("\nSlot %d contains a %d", i, arr[i]);
        }

    }
}
