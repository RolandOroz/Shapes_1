package main;

import base.ShapeBase;
import shape.Rectangle;
import shape.Square;

public class ShapeDisplay {
    private static void displayArea(ShapeBase base) {
        System.out.println("Shape: " + base.getName()
                                     + "\nWidth: "
                                     + base.getWidth()
                                     + "\nHeight: "
                                     + base.getHeight()
                                     + "\nArea: "
                                     + base.calculateArea()
                                     + "\nPerimeter: "
                                     + base.calculatePerimeter());
    }

    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[2];
        shapes[0] = new Rectangle("Rectangle_1", 10, 20);
        shapes[1] = new Square("Square_1", 5, 5);

        for(int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);
        }
    }
}
