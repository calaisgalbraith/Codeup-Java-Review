package grades;

//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property,
    // and initializes the grades property as an empty ArrayList.

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public void recordAttendance(String date, String value){

        //confirm that value is "A" or "P"
        if(value.equals("A") || value.equals("P")){
            attendance.put(date, value);
        }
        else{
            System.out.println("Not a Valid Entry.");
        }
    }

    public double getAttendanceAverage(){
        //(Total Days - Absences) / Total Days.
        double absentDays = 0;

        for(String attendance : attendance.values()){//tally up all absent dates
            if(attendance.equals("A")){
                absentDays++;
            }
        }

        double average = (attendance.size() - absentDays) / attendance.size();

        return Math.round(average*100.0)/100.0;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
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
