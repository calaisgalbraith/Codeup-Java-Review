package shapes;
import util.Input;

//prompts user for radius of circle using input class
//creates circle object & displays area and circumference

//bonus: use YesNo from input to see if user wants to continue making circles
//continue creating circles & displaying info about them until user says no
//before existing, sout total number of circles created
//use private static field and public static method to keep trak & display total circles

public class CircleApp {

    private static int circlesCreated = 0; //placeholder for total circles created
    private Input input;

    public static void trackCircles(){ //method to track circlesCreated
        circlesCreated++;
    }

    public static void createCircle(){ //method to create circle
        Input input = new Input();

        Circle circle = new Circle(input.getInt("Enter radius: "));
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        trackCircles(); //call method to increase total numbers of circles created
    }

    public static void main(String[] args) {
        Input input = new Input();

        //keep creating circles until user says no
        do {
            createCircle();
        }while (input.yesNo("Do you want to make another circle? (y/n)"));

        //print total number of circles created
        System.out.println("Total Circles Created: " + circlesCreated);
    }
}
