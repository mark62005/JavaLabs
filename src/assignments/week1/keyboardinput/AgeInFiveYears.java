package assignments.week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // name
        System.out.println("Hello.  What is your name?");
        String nameInput = scanner.nextLine();

        // age
        System.out.printf("\nHi, %s!  How old are you?\n", nameInput);
        int ageInput = Integer.parseInt(scanner.nextLine());

        System.out.printf("""

                Did you know that in five years you will be %d years old?
                And five years ago you were %d! Imagine that!
                """
                , ageInput + 5, ageInput - 5);

    }
}
