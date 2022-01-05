public class StringExercises {

    //For each of the following output examples: create a String variable that contains the desired output
    // and print it out to the console, you can do this with only one String variable and one print statement for each output example.

    public static void main(String[] args) {

        String statementOne = "We don't need no education We don't need no thought control";
        System.out.println(statementOne.substring(0, 26) + "\n" + statementOne.substring(27, statementOne.length()));

        System.out.println("");

        String statementTwo = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(statementTwo);

        System.out.println("");

        String statementThree = "In windows, the main drive is usually C:\\";
        System.out.println(statementThree);

        System.out.println("");

        String statementFour = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(statementFour.substring(0, 47) + "\n" + statementFour.substring(47, statementFour.length()));

    }
}
