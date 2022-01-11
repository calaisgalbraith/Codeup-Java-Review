package shapes;

//Create a class named Square, also inside of shapes, that extends Rectangle.
// Square should define a constructor that accepts one argument, side, and calls the parent's
    // constructor to set both the length and width to the value of side.

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
