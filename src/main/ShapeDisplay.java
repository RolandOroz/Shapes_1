package main;

import base.ShapeBase;
import comparer.CompareShape;
import shape.Rectangle;
import shape.Square;
import utility.ShapeUtility;

public class ShapeDisplay {
    private static void displayArea(ShapeBase base) {
        System.out.println("Shape: "
                + base.getName()
                + "\nWidth: "
                + base.getWidth()
                + "\nHeight: "
                + base.getHeight()
                + "\nArea: "
                + base.calculateArea()
                + "\nPerimeter: "
                + base.calculatePerimeter()
                + "\n" + base.getClass()
                + " is correct Shape: "
                + base.checkShape()
                + "\nShape is Equal: "
                + "\n");
    }

    public static void main(String[] args) {

        ShapeBase[] shapes = new ShapeBase[4];
        //not a correct Rectangle
        shapes[0] = new Rectangle("Rectangle_1", 0, 0, 10 , 10);
        shapes[1] = new Square("Square_1", 0, 0, 10 , 10);
        shapes[2] = new Rectangle("Rectangle_2", 0,0 , 10 , 20);
        //not a correct Square
        shapes[3] = new Square("Square_2", 0,0, 10 , 20);

        for(int i = 0; i < shapes.length; i++) {
            displayArea(shapes[i]);

        }

        Square square1 = new Square("Square_SA", 11 , 11, 10, 10 );
        Square square2 = new Square("Square_SB", 0,0, 12, 12 );

        Rectangle rect1 = new Rectangle("Rect_A", 0, 100, 40,70);
        Rectangle rect2 = new Rectangle("Rect_B", 0, 0, 40, 101);

//
        CompareShape comp1 = new CompareShape(rect1, rect2);
        comp1.printShapeCompares();

        CompareShape comp2 = new CompareShape(shapes[1], shapes[2]);
        comp2.printShapeCompares();


        //comparing two shapes
        System.out.println("\nAre those two "
          + rect1.getClass()
          + " same: "
          +  rect1.compareShapeIfEqual(rect2));
        System.out.println("\nAre those two "
          + square1.getClass()
          + " same: "
          + square1.compareShapeIfEqual(square2));

        //collision detection
        System.out.println("\n"
          + square1.getName()
          + " and "
          + square2.getName()
          + " Collision: "
          + square1.collisionDetection(square2));

        System.out.println("\n"
          + rect1.getName()
          + " and "
          + rect2.getName()
          + " Collision: "
          + rect1.collisionDetection(rect2));

        ShapeUtility calcAllArea = new ShapeUtility(shapes);

        System.out.println("\n"
        + calcAllArea);

    }


}
