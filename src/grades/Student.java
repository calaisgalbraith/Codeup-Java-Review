package grades;

//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property,
    // and initializes the grades property as an empty ArrayList.

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double average = 0;

        for(int grade : grades){
            average += grade;
        }

        average = average / grades.size();

        //round to two decimal places
        return Math.round(average*100.0)/100.0;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Calais");
        student1.addGrade(100);
        student1.addGrade(98);
        System.out.println(student1.getName());
        System.out.println(student1.getGradeAverage());
    }
}
