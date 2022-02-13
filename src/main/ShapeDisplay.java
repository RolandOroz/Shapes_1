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
                                     + base.calculatePerimeter()
                                     + "\nIs correct Shape: "
                                     + base.checkShape()
                                     + "\n");
    }

    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[4];
        //not a correct Rectangle
        shapes[0] = new Rectangle("Rectangle_1", 20, 20);
        shapes[1] = new Square("Square_1", 5, 5);
        shapes[2] = new Rectangle("Retangle_2", 12,17);
        //not a correct Square
        shapes[3] = new Square("Square_2", 9,8);

        for(int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);
            shapes[i].checkShape();
        }

    }
}
