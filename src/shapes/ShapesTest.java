package shapes;

//test code here


import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Rectangle(4, 5);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

        Measurable myShape2 = new Square(5);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());


    }
}
