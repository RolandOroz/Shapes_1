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
    int sumAllCollidedShapesArea = 0;

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
    int matrixWidth = 0;
    int matrixHeight = 0;

    int[][] matrixOfAllShapes = {{0},{0}};


    int finalMatrixWidth = matrixWidth;
    int finalMatrixHeight = matrixHeight;
    class Cell {
      private final int x;
      private final int y;
      private int state;

      public Cell(int x, int y, int state) {
        this.x = x;
        this.y = y;
        this.state = state;
      }

      public boolean isOff(){
        return state == 0;
      }

      public boolean isOn(){
        return state == 1;
      }

      public void turnOff(){
        state = 0;
      }

      public void turnOn(){
        state = 1;
      }

      Cell[][] array = new Cell[finalMatrixWidth][finalMatrixHeight];
    }



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
      matrixWidth = bottomLeft[0] + topRight[0];
      matrixHeight = bottomLeft[1] + topRight[1];


    }
    matrixOfAllShapes = new int[(int)matrixWidth][(int)matrixHeight];


    for(int j = 0; j < matrixHeight; j++) {

      System.out.print(j + ".. ");
      for (int k = 0; k < matrixWidth; k++) {
        matrixOfAllShapes(Math.abs(bottomLeft[0]),(Math.abs(topRight[0])));

        System.out.print(topRight[0]);
      }
      System.out.println();
    }

    return (matrixHeight * matrixWidth);

  }

  private static void matrixOfAllShapes(int abs, int abs1) {
  }

  public double calculateAllCollidedShapesPerimeter() {
    return 0;
  }
}


