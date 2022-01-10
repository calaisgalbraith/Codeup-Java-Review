package util;

import java.util.Locale;
import java.util.Scanner;

//class with method to validate and/or return command line input from user
//should have methods: String getString, boolean yesNo, int getInt, int getInt(min, max), same w/ doubles
//bonus: allow methods to have optional string parameter, if passed, method should print prompt to user first

public class Input {

    private final Scanner sc = new Scanner(System.in);

    //get and return string from user
    public String getString(){
        return sc.nextLine();
    }

    //get and return string from user w/ prompt
    public String getString(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }

    //return true if user enters y, yes, or variants, no if otherwise
    public boolean yesNo(){
        String userInput = sc.nextLine();
        userInput.toLowerCase(); //make lowercase for standardization

        return userInput.contains("y");
    }

    //return true if user enters y, yes, or variants, no if otherwise w/ prompt
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = sc.nextLine();
        userInput.toLowerCase(); //make lowercase for standardization

        return userInput.contains("y");
    }

    //get int from user
    public int getInt(){
        return sc.nextInt();
    }

    //get int from user w/ prompt
    public int getInt(String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }

    //gets and validates that user input is within certain range (min-max)
    public int getInt(int min, int max){

        int userInput = sc.nextInt();

        if(userInput > max || userInput < min){ //if number is not in range, show err message & recall method
            System.out.println("Error! Number is not within given range");
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
        else{
            return userInput;
        }
    }

    //gets and validates that user input is within certain range (min-max)
    public int getInt(String prompt, int min, int max){
        System.out.println(prompt);
        return getInt(min, max);
    }

    //get double from user
    public double getDouble(){
        return sc.nextDouble();
    }

    //get double from user w/ prompt
    public double getDouble(String prompt){
        System.out.println(prompt);
        return sc.nextDouble();
    }

    //gets and validates that user input is within certain range (min-max)
    public double getDouble(double min, double max){

        double userInput = sc.nextDouble();

        if(userInput > max || userInput < min){ //if number is not in range, show err message & recall method
            System.out.println("Error! Number is not within given range");
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
        else{
            return userInput;
        }
    }

    //gets and validates that user input is within certain range (min-max) w/ prompt
    public double getDouble(String prompt, double min, double max){
        System.out.println(prompt);
        return getDouble(min, max);
    }
}
