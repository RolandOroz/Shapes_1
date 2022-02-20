package utility;

import base.ShapeBase;

import java.awt.*;
import java.util.Arrays;

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

    int[] bottomLeft = new int[2];
    int[] topRight = new int[2];

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
        topRight[0] = Math.abs(maxX);
      } if(getMaxY > maxY) {
        maxY = getMaxY;
        topRight[1] = Math.abs(maxY);
      } if(getX < minX) {
        minX = getX;
        bottomLeft[0] = Math.abs(minX);
      } if(getY < minY) {
        minY = getY;
        bottomLeft[1] = Math.abs(minY);
      }



    }return ((bottomLeft[0] + topRight[0]) * (bottomLeft[1] + topRight[1]));

  }




    public double calculateAllCollidedShapesPerimeter() {
    return 0;
  }
}


