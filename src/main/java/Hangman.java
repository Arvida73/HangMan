import java.util.*;

public class Hangman {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter answer:   ");
        String answer = scn.nextLine();
        Game game = new Game(/*args[0]*/ answer);
        Prompter prompter = new Prompter(game);
        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();


        }
        prompter.displayOutcome();
    }
}
