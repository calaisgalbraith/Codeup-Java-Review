package grades;
import java.util.HashMap;

//Create a class named GradesApplication with a main method.
// Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.


public class GradesApplication {

    //method to displayGrades
    public static void displayGrades(HashMap<String, Student> students){





    }

    //method to get user

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
        students.put("FlufflyLady", jubilee);
        students.put("LittleTerror", nala);
        students.put("PublicMenace", zulu);

        displayGrades(students);
    }
}
