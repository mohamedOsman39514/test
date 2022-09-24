package Abstraction;

import Abstraction.Circle;
import Abstraction.Rectangle;
import Abstraction.Shape;

public class Main {
    public static void main(String[] args) {

        //programming for interfaces not implementation
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area=" + shape.getArea());

        //switching from one implementation to another easily
        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area=" + shape.getArea());

        shape = new Rectangle(50,5);
        shape.draw();
        System.out.println("Area=" + shape.getArea());


        ////////////////////////////////////////////////////









    }

}