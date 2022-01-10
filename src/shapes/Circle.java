package shapes;

//circle class should have private radius field, constructor, methods to get area & get circumference

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

    }
}
