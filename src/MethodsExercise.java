import java.util.Scanner;

public class MethodsExercise {







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
        factorial();
    }
}
