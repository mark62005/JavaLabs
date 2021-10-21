package assignments.week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // name
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");
        String nameInput = scanner.nextLine();

        // age
        System.out.printf("\nOk, %s, how old are you?\n", nameInput);
        int ageInput = Integer.parseInt(scanner.nextLine());

        if (ageInput >= 25) {
            System.out.printf("You can do pretty much anything, %s.", nameInput);
        } else if (ageInput >= 18) {
            System.out.printf("You can vote but not rent a car, %s.", nameInput);
        } else if (ageInput >= 16) {
            System.out.printf("You can drive but not vote, %s.", nameInput);
        } else {
            System.out.printf("You can't drive, %s.", nameInput);
        }

    }
}
