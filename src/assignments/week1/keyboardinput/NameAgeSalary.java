package assignments.week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // name
        System.out.println("Hello.  What is your name?");
        String nameInput = scanner.nextLine();

        // age
        System.out.printf("\nHi, %s!  How old are you?\n", nameInput);
        int ageInput = Integer.parseInt(scanner.nextLine());

        System.out.printf("\nSo you're %d, eh?  That's not old at all!", ageInput);

        // salary
        System.out.printf("\nHow much do you make, %s?\n", nameInput);
        double salaryInput = Double.parseDouble(scanner.nextLine());

        System.out.printf("\n%.2f! I hope that's per hour and not per year! LOL!", salaryInput);

    }
}
