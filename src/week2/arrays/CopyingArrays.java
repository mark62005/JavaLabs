package week2.arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            Random random = new Random();
            arr1[i] = random.nextInt(100);
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }

        printArr("Array 1", arr1);
        printArr("Array 2", arr2);

    }

    public static void printArr(String arrName, int[] arr) {

        StringBuilder str = new StringBuilder();
        for (int num : arr) {
            str.append(num).append(" ");
        }

        System.out.println(arrName + ": " + str);

    }

}
