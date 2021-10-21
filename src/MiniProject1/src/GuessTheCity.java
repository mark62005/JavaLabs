import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class GuessTheCity {

    private String hiddenCity;  // the target city
    private char[] targetArr;   // the array for printing
    private final List<Character> correctGuesses = new ArrayList<>();
    private final List<Character> wrongGuesses = new ArrayList<>();
    private int wrongGuessCount;

    public GuessTheCity() {
        try {

            Cities cities = new Cities();

            this.hiddenCity = cities.getCity();
            this.targetArr = new char[this.hiddenCity.length()];

            for (int i = 0; i < hiddenCity.length(); i++) {
                // if one of the character in hidden city is a space
                if (hiddenCity.charAt(i) == ' ') {
                    targetArr[i] = ' ';
                } else {
                    targetArr[i] = '_';
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public char[] getTargetArr() {
        return targetArr;
    }

    public List<Character> getCorrectGuesses() {
        return correctGuesses;
    }

    // return the string of wrong guess lists
    public String getWrongGuessesAsString() {

        return wrongGuesses.stream()
                .map(ch -> ch + " ")
                .collect(Collectors.joining());

//        StringBuilder stringBuilder = new StringBuilder();
//        for (char ch : wrongGuesses) {
//            stringBuilder.append(ch).append(" ");
//        }
//        return stringBuilder.toString();

    }

    public int getWrongGuessCount() {
        return wrongGuessCount;
    }

    // check if the guess is a correct guess
    public boolean isCorrectGuess(char guess) {
        return hiddenCity.toLowerCase(Locale.ROOT).indexOf(guess) != -1;
    }

    public void handleGuess(char guess) {

        if (isCorrectGuess(guess)) {
            for (int i = 0; i < hiddenCity.length(); i++) {
                if (guess == hiddenCity.toLowerCase(Locale.ROOT).charAt(i)) {
                    // capitalize the first letter
                    if (i == 0) {
                        targetArr[i] = Character.toUpperCase(guess);
                    } else {
                        targetArr[i] = guess;
                    }
                }
            }
            // add this guess to the correct guess list
            correctGuesses.add(guess);
        } else {
            wrongGuesses.add(guess);
            wrongGuessCount ++;
        }

    }

    public String checkWin() {

        // if targetArr equals to hidden city, user wins
        if (String.valueOf(targetArr).equals(hiddenCity)) {
            return String.format("""
                    ===============================================================
                    You win!
                    You have guessed '%s' correctly.
                    """, hiddenCity);
        // if user has 10 wrong guesses, they lose
        } else if (wrongGuessCount == 10) {
            return String.format("""
                    ===============================================================
                    You have guessed (10) wrong letters: %s
                    You lose!
                    The correct word is '%s'!
                    """,
                    getWrongGuessesAsString(),
                    hiddenCity
            );
        }
        return "";

    }

}
