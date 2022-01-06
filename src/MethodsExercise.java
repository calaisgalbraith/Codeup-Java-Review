import java.util.Scanner;

public class MethodsExercise {


    //------------------------------------
    //Create an application that simulates dice rolling.
        //Ask the user to enter the number of sides for a pair of dice & prompt the user to roll the dice.
        //"Roll" two n-sided dice, display the results of each, and then ask the user if they want to roll the dice again.
        //Use static methods to implement the method(s) that generate the random numbers.
        //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void getDiceSides(){ //method to roll dice
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true; //boolean value to see if user wants to continue/keep going

        System.out.println("Enter the number of sides for a pair of dice: "); //prompt for number of sides of dice
        int sides = Integer.parseInt(scanner.nextLine());

        while(keepGoing){
            System.out.println("Roll the dice! (Press any key)"); //prompt user to roll dice
            String roll = scanner.nextLine();

            rollDice(sides); //roll dice

            System.out.println("Do you want to roll again? (yes/no)");
            String answer = scanner.nextLine();

            if(answer.equals("no")){
                keepGoing = false; //if user does not want to continue, loop keeps going
            }
        }
        System.out.println("Goodbye!");

    }

    public static void rollDice(int max){ //get and print the numbers for a roll
        int firstRoll = (int)(Math.random() * max + 1);
        int secondRoll = (int)(Math.random() * max + 1);

        System.out.println("First roll: " + firstRoll);
        System.out.println("Second roll: " + secondRoll);
        System.out.println("Total Roll: " + (firstRoll + secondRoll));

    }

    //------------------------------------
    //Calculate the factorial of a number.
        //Prompt the user to enter an integer from 1 to 10 & display factorial of entered number
        //Assume that the user will enter an integer, but verify it’s between 1 and largest int possible for factorial
        //Use a for loop to calculate the factorial & use long to store factorial
        //Ask if the user wants to continue & continue only if the user agrees to.
    public static void factorial(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number between 1 and 20: "); //get and validate int
        int userInput = getInteger(1, 20);
        long factorial = userInput;

        for(int i = userInput - 1; i > 0; i--){ //calculate factorial
            factorial *= i;
        }

        System.out.println(factorial);

        System.out.println("Do you want to continue? (yes/no)"); //ask if want to continue
        String answer = scanner.nextLine();
        if(answer.equals("yes")){ //if yes, call method to continue
            factorial();
        }
        else {
            System.out.println("Goodbye!");
        }
    }


    //------------------------------------
    //Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max){

        Scanner scanner = new Scanner(System.in); //import scanner to read user input
        int userInput = scanner.nextInt();

        if(userInput > max || userInput < min){ //if number is not in range, show err messag & recall method
            System.out.println("Error! Number is not within given range");
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInteger(min, max);
        }
        else{
            return userInput;
        }
    }

    //------------------------------------
    //Arithmetic methods
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int division(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b){
        return a % b;
    }


    public static void main(String[] args) {
//        System.out.println(getInteger(1, 10));
//        factorial();
        getDiceSides();
    }
}
