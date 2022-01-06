import java.util.Random;
import java.util.Scanner;
import util.Input;

public class HighLow {

    //Build a high-low guessing game
        //Game picks a random number between 1 and 100.
        //Prompts user to guess the number & validate user input
        //If user's guess is less than the number, it outputs "HIGHER".
        //If user's guess is more than the number, it outputs "LOWER".
        //If a user guesses the number, the game should declare "GOOD GUESS!"
    //Bonus
        //Keep track of how many guesses a user makes.
        //Set an upper limit on the number of guesses.

    public static void highLow(){

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();

        //get random number between 1 and 100
        Random randomNum = new Random();
        int gameGuess = randomNum.nextInt(101 - 1) + 1;

        boolean correctAnswer = false; //placeholder for continue game until correct answer is made
        int guessesRemaining = 10; //keep track of guesses remaining
        int guessesMade = 0; //keep track of how many guesses a user makes

        System.out.println("Let the game begin! Guess which number I picked between 1 and 100! You have 10 tries to do so.");

        while(!correctAnswer && guessesRemaining > 0){ //go through game while guess is incorrect or user runs out of attempts

            guessesMade++; //increase number of guesses made

            System.out.println("\nGuess a number between 1 and 100! (" + guessesRemaining + " guesses remaining)");
            int userGuess = input.getInt(1, 100); //get and validate user guess

            correctAnswer = guessResult(gameGuess, userGuess); //check gameGuess vs userGuess

            guessesRemaining--; //decrease number of guesses remaining
        }

        //if correctAnswer is still false, means game was not successful
        if(!correctAnswer){
            System.out.println("GAME OVER! YOU LOSE!");
            System.out.println("The number was: " + gameGuess);
        }
        else{
            System.out.println("CONGRATULATIONS! YOU WIN!");
            System.out.println("The number was: " + gameGuess);
            System.out.println("Total guesses to win: " + guessesMade);
        }
    }

    //method to check if user guess = computer guess
    public static boolean guessResult(int gameGuess, int userGuess){

        if(userGuess == gameGuess){
            System.out.println("GOOD GUESS!");
            return true;
        }

        else if(userGuess > gameGuess){
            System.out.println("HIGHER");
        }
        else{
            System.out.println("LOWER");
        }

        return false;
    }

    public static void main(String[] args) {
            highLow();
    }
}
