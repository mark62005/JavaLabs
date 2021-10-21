import java.util.Scanner;
import java.util.regex.Pattern;

public class Driver {

    static Scanner scanner = new Scanner(System.in);
    static GuessTheCity guessTheCity = new GuessTheCity();

    public static void main(String[] args) {

        // display the initial question
        displayQuestion("start");
        // keep the game running
        while (true) {
            // ask user to type a letter
            char guess = handleUserInput();
            guessTheCity.handleGuess(guess);
            // check if user wins after every input
            if (!guessTheCity.checkWin().equals("")) {
                // print the result if the game ends
                System.out.println(guessTheCity.checkWin());
                break;
            }
            displayQuestion("playing");
        }

    }

    public static void displayQuestion(String condition) {

        if (condition.equals("start")) {
            System.out.println("Here's the question.");
            System.out.println(guessTheCity.getTargetArr());
            System.out.println("Guess a letter: ");
        } else {
            System.out.printf("""
                    ===============================================================
                    You are guessing: %s
                    You have guessed (%d) wrong letters: %s
                    Guess a letter:\040
                    """,
                    String.valueOf(guessTheCity.getTargetArr()),
                    guessTheCity.getWrongGuessCount(),
                    guessTheCity.getWrongGuessesAsString()
            );
        }

    }

    public static char handleUserInput() {

        char guess = handleInputFormat(scanner.nextLine());

        // make sure user won't enter the same letter with correct guess
        while (guessTheCity.getCorrectGuesses().contains(guess)) {
            System.out.println("You already found this letter, please try another one.");
            System.out.println("Guess a letter: ");
            guess = scanner.nextLine().charAt(0);
        }

        return Character.toLowerCase(guess);

    }

    public static char handleInputFormat(String userInput) {

        String guessRegex = "[a-zA-Z]";
        Pattern pattern = Pattern.compile(guessRegex);

        // make sure user input only enter 1 letter
        while (!pattern.matcher(userInput).matches()) {
            System.out.println("Invalid input, please enter a letter: ");
            userInput = scanner.nextLine();
        }

        return userInput.charAt(0);

    }

}
