package utility;

import base.ShapeBase;

import java.awt.*;

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

    //Setting the matrix from lowest x, y point to
    // highest x, y point (x1,y1 - x2,y2)

    // x + width
    int maxX = 0;
    // y + width
    int maxY = 0;
    // x
    int minX = 0;
    // y
    int minY = 0;

    int bottomLeft = 0;
    int topRight = 0;

    int combinedShapes = 0;


    //todo only a try to use Polygon
    Polygon poly = new Polygon();
    poly.addPoint(minX, minY);

    for(int i = 0; i < shapes.length; i++) {
      int getX  = shapes[i].getX();
      int getY  = shapes[i].getY();
      int getMaxX = (int) (shapes[i].getX() + shapes[i].getWidth());
      int getMaxY = (int) (shapes[i].getY() + shapes[i].getHeight());

      if(getMaxX > maxX) {
        maxX = getMaxX;
      } if(getMaxY > maxY) {
        maxY = getMaxY;
      } if(getX < minX) {
        minX = getX;
      } if(getY < minY) {
        minY = getY;
      }




    }return maxY;
  }




    public double calculateAllCollidedShapesPerimeter() {
    return 0;
  }
}


