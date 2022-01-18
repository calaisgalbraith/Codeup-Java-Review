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
        String userInput = (sc.nextLine()).toLowerCase(); //make lowercase for standardization
        return userInput.contains("y");
    }

    //return true if user enters y, yes, or variants, no if otherwise w/ prompt
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        String userInput = (sc.nextLine()).toLowerCase(); //make lowercase for standardization
        return userInput.contains("y");
    }

    //get int from user
    public int getInt(){
        int number;

        try{
            number = Integer.parseInt(sc.nextLine());
            return number;
        }catch (Exception e){
            System.out.println("Error! Input is not a valid integer");
            return getInt();
        }
    }

    //get int from user w/ prompt
    public int getInt(String prompt){
        System.out.println(prompt);

        int number;
        try{
            number = Integer.parseInt(sc.nextLine());
            return number;
        }catch (Exception e){
            System.out.println("Error! Input is not a valid integer");
            return getInt(prompt);
        }
    }

    //gets and validates that user input is within certain range (min-max)
    public int getInt(int min, int max){
        int number;
        try{
            number = Integer.parseInt(sc.nextLine());

            if(number > max || number < min){
                System.out.println("Error! Number is not within given range");
                System.out.println("Please enter a number between " + min + " and " + max);
                return getInt(min, max);
            }
            else{
                return number;
            }
        }catch (Exception e){
            System.out.println("Error! Input is not a valid integer");
            return getInt(min, max);
        }
    }

    //gets and validates that user input is within certain range (min-max)
    public int getInt(String prompt, int min, int max){
        System.out.println(prompt);

        int number;
        try{
            number = Integer.parseInt(sc.nextLine());

            if(number > max || number < min){
                System.out.println("Error! Number is not within given range");
                System.out.println("Please enter a number between " + min + " and " + max);
                return getInt(prompt, min, max);
            }
            else{
                return number;
            }
        }catch (Exception e){
            System.out.println("Error! Input is not a valid integer");
            return getInt(prompt, min, max);
        }
    }

    //get double from user
    public double getDouble(){
        double number;
        try{
            number = Double.parseDouble(sc.nextLine());
            return number;
        }catch (Exception e){
            System.out.println("Error! Input is not a valid double");
            return getDouble();
        }
    }

    //get double from user w/ prompt
    public double getDouble(String prompt){
        System.out.println(prompt);
        double number;

        try{
            number = Double.parseDouble(sc.nextLine());
            return number;
        }catch (Exception e){
            System.out.println("Error! Input is not a valid double");
            return getDouble();
        }
    }

    //gets and validates that user input is within certain range (min-max)
    public double getDouble(double min, double max){

        double number;
        try{
            number = Double.parseDouble(sc.nextLine());

            if(number > max || number < min){
                System.out.println("Error! Number is not within given range");
                System.out.println("Please enter a number between " + min + " and " + max);
                return getDouble(min, max);
            }
            else{
                return number;
            }
        }catch (Exception e){
            System.out.println("Error! Input is not a valid double");
            return getDouble(min, max);
        }
    }

    //gets and validates that user input is within certain range (min-max) w/ prompt
    public double getDouble(String prompt, double min, double max){
        System.out.println(prompt);

        double number;
        try{
            number = Double.parseDouble(sc.nextLine());

            if(number > max || number < min){
                System.out.println("Error! Number is not within given range");
                System.out.println("Please enter a number between " + min + " and " + max);
                return getDouble(prompt, min, max);
            }
            else{
                return number;
            }
        }catch (Exception e){
            System.out.println("Error! Input is not a valid double");
            return getDouble(prompt, min, max);
        }
    }

    //gets and validates user input for binary
    public int getBinary(){
        try{
            return Integer.valueOf(getString(), 2);
        } catch(NumberFormatException e){
            System.out.println("Error: Input is not a number!");
            return getBinary();
        }
    }


    //gets and validates user input for hexadecimal
    public int getHex(){
        try{
            return Integer.valueOf(getString(), 16);
        } catch (NumberFormatException e){
            System.out.println("Error: Input is not a number!");
            return getHex();
        }
    }
}
