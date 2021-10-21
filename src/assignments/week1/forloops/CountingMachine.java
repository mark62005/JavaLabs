package assignments.week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Count to: ");
        int target = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < (target + 1); i++) {
            System.out.print(i + " ");
        }

    }
}
