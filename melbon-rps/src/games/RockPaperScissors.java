package games;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RockPaperScissors {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    Player player;

    Fist aIFist;

    RockPaperScissors(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aIFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors("", 0);
        game.playGame();

        // aIFist.play()
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);

        //forloop börjar här

        for (int i = 0; i < 3; i++) {
            int guess = 0;
            int wrongGuess = 0;
            boolean guessIsOutOfBounds = true;

            System.out.println("Rock, Paper or Scissors?: ");
            String choice = scanner.nextLine();

            String stringResult = "";
            int intResult = aIFist.play();

            if (intResult == Fist.ROCK) {
                stringResult = "ROCK";
            }
            if (intResult == Fist.PAPER) {
                stringResult = "PAPER";
            }
            //  System.out.println(stringResult);
            if (intResult == Fist.SCISSORS) {
                stringResult = "SCISSORS";

            }
            if (choice.equals("Rock") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Paper") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Scissors") && stringResult.equals("ROCK")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }
            if (choice.equals("Rock") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }
            if (choice.equals("Rock") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Scissors") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Scissors") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Du vann!");
            }
            if (choice.equals("Paper") && stringResult.equals("PAPER")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Oavgjort!");
            }
            if (choice.equals("Paper") && stringResult.equals("SCISSORS")) {
                System.out.println("Datorn valde " + stringResult + "\n" + "Datorn vann!");
            }


        }
    }
}







