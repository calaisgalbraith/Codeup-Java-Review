import java.util.Scanner;

public class Bob {

    //Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //He answers 'Whatever.' to anything else.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("My name is Bob, what do you want?");

        boolean keepGoing = true; //boolean to see if keep converstation going or not

        while (keepGoing){
            String input = scanner.nextLine();
            int length = input.length(); //length of string

            if(input.equals("")){ //input is nothing
                System.out.println("Fine. Be that way!");
            }
            else if(input.charAt(length - 1) == '?'){ //input is a question
                System.out.println("Sure");
            }
            else if(input.charAt(length - 1) == '!'){ //input is a yell
                System.out.println("Woah, chill out!");
            }
            else { //else
                System.out.println("Whatever");
            }

            //check if to continue conversation
            System.out.println("Do you need anything else or can I go back to sleep? (yes/no)");
            String response = scanner.nextLine();

            if(response.equals("no")) { //if no, set keepGoing to false to exit loop
                keepGoing = false;
                System.out.println("Get out of my room...");
            }
            else {
                System.out.println("What else do you need then?");
            }
        }
    }


}
