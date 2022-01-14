package grades;
import util.Input;

import java.util.HashMap;
import java.util.Map;

//Create a class named GradesApplication with a main method.
// Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.

//Bonus
    //Display all the student's grades in addition to the grade average.
    //Allow the user to view all the grades for all the students.
    //Modify your CLI to provide an option to view the overall class average.
    //Modify your CLI to provide an option to print a csv report of all the students.
    //Add attendance property to student objects

public class GradesApplication {

    private static Input input = new Input();

    //display menu and get choice for what method to use
    public static void displayMenu(HashMap<String, Student> students){
        System.out.println("Welcome! What would you like to do?\n" +
                "0 - exit\n" +
                "1 - view & access student information\n" +
                "2 - view overall class average\n" +
                "3 - print csv report of all students");

        int choice = input.getInt(0, 3); //get user choice

        switch (choice){//depending on choice, execute selected method
            case 1: displayChoice(students);
                break;
            case 2: displayClassAverage(students);
                break;
            case 3: printReport(students);
            default:
                System.out.println("Ending Method, Goodbye!");
        }
    }

    //method to display overall class average
    public static void displayClassAverage(HashMap<String, Student> students){

        int total = 0;

        for(Student student : students.values()){//calculate total
            total += student.getGradeAverage();
        }

        System.out.println("Overall Class Average: " + (total / students.size())); //print average
        System.out.println("");

        displayMenu(students); //return to main menu
    }

    //method to print csv report for all students
    public static void printReport(HashMap<String, Student> students){

        //loop through hashmap keys & values
        for(Map.Entry<String, Student> entry : students.entrySet()){
            System.out.println(entry.getValue().getName() + ", " + entry.getKey() + ", " + entry.getValue().getGradeAverage());
        }
        System.out.println(" ");

        displayMenu(students); //return to main menu
    }

    //method to display & get choice for student to see information on
    public static void displayChoice(HashMap<String, Student> students){

        System.out.println("Here are the Github usernames of our students:\n");

        //print all usernames of students
        for(String username : students.keySet()){
            System.out.print("|" + username + "|  ");
        }

        //get user choice
        String fixNextIntError = input.getString();
        String choice = input.getString("\n\nWhat student would you like to see more information on?");

        //check if username is present in hashmap
        if(students.containsKey(choice)){ //if so, call displayGrades method with choice
            displayIndividualGrades(students.get(choice), choice);
        }
        else{
            System.out.println("Sorry, no student found with the Github username of \"" + choice + "\"");
        }

        //see if want to continue or not
        if(input.yesNo("Would you like to see another student?")){
            displayChoice(students);
        }
        else {
            displayMenu(students);
        }
    }

    //method to display grade information for selected student
    public static void displayIndividualGrades(Student student, String username){
        System.out.println("\nName: " + student.getName() + " - Github Username: " + username);
        System.out.println("Current Grades: ");

        for(int grade : student.getGrades()){
            System.out.print(grade + " ");
        }

        System.out.println("\nCurrent Average: " + student.getGradeAverage() + "\n");
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

        students.put("barkingRat", chanel);
        students.put("fluffyLady", jubilee);
        students.put("littleTerror", nala);
        students.put("publicMenace", zulu);

        displayMenu(students);
    }
}
