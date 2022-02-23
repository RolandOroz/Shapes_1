package main;

import base.ShapeBase;
import comparer.CompareShape;
import shape.Rectangle;
import shape.Square;
import utility.Matrix;
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

        ShapeBase[] shapes = new ShapeBase[2];
        //not a correct Rectangle
        shapes[0] = new Square("Square_1", -12, -12, 2 , 2);
        shapes[1] = new Square("Square_2", 3, 3, 2 , 2);
//        shapes[2] = new Rectangle("Rectangle_1", 4,4 , 20 , 10);
//        shapes[3] = new Square("Square_3", 11,12, 8 , 8);
//        shapes[4] = new Square("Square_4", 11,-2, 4 , 4);
//        shapes[5] = new Rectangle("Rectangle_2", 15,2, 10 , 20);
//        shapes[6] = new Rectangle("Rectangle_3", 20,24, 10 , 6);


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

//        CompareShape comp2 = new CompareShape(shapes[1], shapes[2]);
//        comp2.printShapeCompares();


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
          + rect1.collisionDetection(rect2)
          + "\n");

        new ShapeUtility();
        double calcAllArea = ShapeUtility.calculateAllShapesAreas(shapes);
        double calcAllPerim = ShapeUtility.calculateAllShapesPerimeter(shapes);
        double calcAllCollidArea = ShapeUtility.calculateAllCollidedShapesAreas(shapes);

        System.out.println("\n All shapes Area: "
                + calcAllArea
                + "\n All shapes Perimeter: "
                + calcAllPerim
                + "\n Matrix Area: "
                + calcAllCollidArea);
        System.out.println(Matrix.offsetPoint(shapes));
    }
}
