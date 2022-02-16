package utility;

import base.ShapeBase;

public class ShapeUtility {

  public void displayUtility(ShapeBase shapeBase) {
    System.out.println();
  }



  // TODO change!!!!!!!!!
  public static double calculateAllShapesAreas(ShapeBase[] shapes) {

    double sumAllShapesArea = 0;
    for (int i = 0; i < shapes.length; i++){

      sumAllShapesArea += shapes[i].calculateArea();

    }
    return sumAllShapesArea;
  }

  public static double calculateAllShapesPerimeter(ShapeBase[] shapes) {

    double sumAllShapesPerimeter = 0;
    for (int i = 0; i < shapes.length; i++){

      sumAllShapesPerimeter += shapes[i].calculatePerimeter();

    }
    return sumAllShapesPerimeter;

  }
//TODO change !!!!!!!11
  public static double calculateAllCollidedShapesAreas(ShapeBase[] shapes) {
    double sumAllCollidedShapesArea = 0;
    for(int i = 0; i < shapes.length; i++) {
      if(shapes[i].collisionDetection()) {
        sumAllCollidedShapesArea += shapes[i].calculateArea();
      }
    }return sumAllCollidedShapesArea;
  }


    public double calculateAllCollidedShapesPerimeter() {
    return 0;
  }
}


