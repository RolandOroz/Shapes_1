package utility;

import base.ShapeBase;

//Todo make init off shapes!!!!!

//Setting teh Matrix width and height
public class Matrix {




//  private int maxX = Integer.MIN_VALUE;
//  private int maxY = Integer.MIN_VALUE;
//  private int minX = Integer.MAX_VALUE;
//  private int minY = Integer.MAX_VALUE;



  protected int setupMatrix(ShapeBase[] shapes){

    int sumAllCollidedShapesArea = 0;

    //Setting the matrix from lowest x, y point to
    // highest x, y point (x1,y1 - x2,y2)

    // x + width
    int maxX = Integer.MIN_VALUE;
    // y + width
    int maxY = Integer.MIN_VALUE;
    // x
    int minX = Integer.MAX_VALUE;
    // y
    int minY = Integer.MAX_VALUE;

    //Offsetting minX and minY if minus to (0)x and (0)y
    int offsetMinX = Integer.MAX_VALUE;
    int offsetMinY = Integer.MAX_VALUE;
    int offsetMaxX = Integer.MIN_VALUE;
    int offsetMaxY = Integer.MIN_VALUE;

    int[] bottomLeft = new int[2];
    int[] topRight = new int[2];
    int matrixWidth = 0;
    int matrixHeight = 0;


    int finalMatrixWidth = matrixWidth;
    int finalMatrixHeight = matrixHeight;


    for(int i = 0; i < shapes.length; i++) {
      int shapeX  = shapes[i].getX();
      int shapeY  = shapes[i].getY();
      int shapeMaxX = (int) (shapes[i].getX() + shapes[i].getWidth());
      int shapeMaxY = (int) (shapes[i].getY() + shapes[i].getHeight());

      if(shapeX < 0) {
        offsetMinX = 0;
        offsetMaxX = offsetMinX + shapeMaxX;
      }
      if(shapeY < 0) {
        offsetMinY = 0;
        offsetMaxY = offsetMinY + shapeMaxX;
      }
      if(shapeX >= 0) {
        offsetMinX = shapeX;
        offsetMaxX =  shapeMaxX;
      }
      if(shapeY >= 0) {
        offsetMinY = shapeY;
        offsetMaxY =  shapeMaxY;
      }

      if(shapeMaxX > maxX) {
        maxX = shapeMaxX;
        topRight[0] = Math.abs(maxX);

      }
      if(shapeMaxY > maxY) {
        maxY = shapeMaxY;
        topRight[1] = Math.abs(maxY);
      }
      if(shapeX < minX) {
        minX = shapeX;
        bottomLeft[0] = Math.abs(minX);
      }
      if(shapeY < minY) {
        minY = shapeY;
        bottomLeft[1] = Math.abs(minY);
      }
      matrixWidth = bottomLeft[0] + topRight[0];
      matrixHeight = bottomLeft[1] + topRight[1];


    }
   // int[][] allShapesMinPoint = new int[offsetMinX][offsetMinY];
    int [][] matrixOfAllShapes = new int[(int)matrixHeight][(int)matrixWidth];



    for(int j = 0; j < matrixHeight; j++) {

      System.out.print(j + ".. ");
      for (int k = 0; k < matrixWidth; k++) {

        matrixOfAllShapes[j][k] = 0;


          matrixOfAllShapes[offsetMinX][offsetMinY] = 1;
          matrixOfAllShapes[offsetMaxX][offsetMaxY] = 1;

        System.out.print(matrixOfAllShapes[j][k]);
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


  public void displayMatrix(ShapeBase[] shapes){
    this.setupMatrix(shapes);
  }

}
