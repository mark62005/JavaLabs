package assignments.week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("I will add up the numbers you give me.");
        while (true) {

            System.out.print("Number: ");
            int numInput = Integer.parseInt(scanner.nextLine());

            // if user enter a 0, end the loop and print the sum
            if (numInput == 0) {
                System.out.printf("\nThe total is %d.", sum);
                break;
            }
            // else add up the sum with numInput
            sum += numInput;
            System.out.printf("The total so far is %d\n", sum);

        }
//
    }
}
