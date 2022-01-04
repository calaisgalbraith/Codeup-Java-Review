import java.util.Scanner;

public class ControlFlowExercises {


    //loop exercises
    public static void loopBasics(){

        //while loop --> while i <- 15, print index
            int x = 5;
            while(x <= 15){
             System.out.print(x + " ");
             x++;
            }

        //do while loop --> 0 to 100 count by 2
            int a = 0;
            do {
                System.out.println(a);
                a += 2;
            }while (a <= 100);

        //do while loop --> count backwards by 5 from 100 to -10
            int b = 100;
            do{
                System.out.println(b);
                b -= 5;
            }while (b >= -10);

        //do while loop --> starts at 2, display squared number on each line while number is < 1000000
            double c = 2;
            do{
                System.out.println((int) c);
                c = Math.pow(c, 2);
            }while (c < 1000000);

        //for loop, refactor all exercises to be in a for loop

            //while i <- 15, print index
            for(int i = 5; i <= 15; i ++){
                System.out.println(i);
            }

            //0 to 100 count by 2
            for(int i = 0; i <= 100; i += 2){
                System.out.println(i);
            }

            //count backwards by 5 from 100 to -10
            for(int i = 100; i >= -10; i -= 5){
                System.out.println(i);
            }

            //starts at 2, display squared number on each line while number is < 1000000
            for(double i = 2; i < 1000000; i *= i){
                System.out.println((int) i);
            }
    }


    //Write a program that prints the numbers from 1 to 100.
    //For multiples of three: print “Fizz” instead of the number.
    //For the multiples of five: print “Buzz”.
    //For numbers which are multiples of both three and five: print “FizzBuzz”.
    public static void fizzBuzz(){
        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    //Display a table of powers.
    //Prompt the user to enter an integer.
    //Display a table of squares and cubes from 1 to the value entered.
    //Assume that the user will enter valid data.
    //Ask if the user wants to continue && only continue if user agrees to
    public static void powersTable(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");

        int input = scanner.nextInt();

        System.out.println("Here is your table!\n");
        System.out.println("Number: " + input);
        System.out.println("Squared: " + (input * input));
        System.out.println("Cubed: " + (input * input * input) + "\n");

        System.out.println("Do you want to continue? (yes/no)");
        String keepGoing = scanner.next();

        if(keepGoing.equals("yes")){
            powersTable();
        }

        System.out.println("Goodbye");
    }

    public static void main(String[] args) {
        loopBasics();
        fizzBuzz();
        powersTable();
    }



}
