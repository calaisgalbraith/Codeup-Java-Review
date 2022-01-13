package grades;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

//Create a class named GradesApplication with a main method.
// Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.


public class GradesApplication {

    private static Input input = new Input();

    //method to display & get choice
    public static void displayChoice(HashMap<String, Student> students){

        System.out.println("Welcome!\n\n" +
                "Here are the Github usernames of our students:\n");

        //print all usernames of students
        for(String username : students.keySet()){
            System.out.print("|" + username + "|  ");
        }

        //get user choice
        String choice = input.getString("\n\nWhat student would you like to see more information on?");

        //check if username is present in hashmap
        if(students.containsKey(choice)){ //if so, call displayGrades method with choice
            displayGrades(students.get(choice), choice);
        }
        else{
            System.out.println("Sorry, no student found with the Github username of \"" + choice + "\"");
        }

        //call method to see if want to continue or not
        if(keepGoing()){
            displayChoice(students);
        }
        else {
            System.out.println("Ending method, goodbye!");
        }
    }

    //method to display grade information
    public static void displayGrades(Student student, String username){
        System.out.println("\nName: " + student.getName() + " - Github Username: " + username);
        System.out.println("Current Average: " + student.getGradeAverage() + "\n");
    }

    //method to see if want to continue or not
    public static boolean keepGoing(){
        return input.yesNo("Would you like to see another student?");
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student chanel = new Student("Chanel");
        chanel.addGrade(75);
        chanel.addGrade(80);
        chanel.addGrade(70);

        Student jubilee = new Student("Jubilee");
        jubilee.addGrade(90);
        jubilee.addGrade(95);
        jubilee.addGrade(94);

        Student nala = new Student("Nala");
        nala.addGrade(80);
        nala.addGrade(85);
        nala.addGrade(86);

        Student zulu = new Student("Zulu");
        zulu.addGrade(100);
        zulu.addGrade(95);
        zulu.addGrade(96);

        students.put("BarkingRat", chanel);
        students.put("FluffyLady", jubilee);
        students.put("LittleTerror", nala);
        students.put("PublicMenace", zulu);

        displayChoice(students);
    }
}
