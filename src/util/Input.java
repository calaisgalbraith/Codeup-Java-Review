package util;

import java.util.Scanner;

public class Input {

    private final Scanner sc = new Scanner(System.in);

    //gets and validates that user input is within certain range
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


}
