import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        //--------------------

        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();

        //Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
        System.out.println("Enter three words: ");

        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the nextLine method.
        // Then, display that sentence back to the user.
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println(sentence);


        //--------------------
        //Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        System.out.println("Enter Length: ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Width: ");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Height: ");
        int height = Integer.parseInt(scanner.nextLine());

        //Display the area and perimeter of that classroom.
        int area = length * width;
        System.out.println("Area: " + area);

        int perimeter = (2 * length) + (2 * width);
        System.out.println("Perimeter: " + perimeter);

        //Calculate the volume of the rooms in addition to the area and perimeter.
        int volume = area * height;
        System.out.println("Volume: " + volume);

    }

}
