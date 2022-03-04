package utility;

import base.ShapeBase;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Todo make init off shapes!!!!!

//Setting teh Matrix width and height
public class Matrix {

  private int[][] shapeMatrix;
//  private int minX = Integer.MAX_VALUE;
//  private int minY = Integer.MAX_VALUE;

  public Matrix(Collection<ShapeBase> shapes) {
    init((Collection<ShapeBase>) shapes);
  }


  private void init(Collection<ShapeBase> shapes) {
    //    Declare new int variables minX and minY and set their values as max integers.
//      Declare new int variables maxX and maxY and set their values as min integers.
    int minX = Integer.MAX_VALUE;
    int minY = Integer.MAX_VALUE;
    int maxX = Integer.MIN_VALUE;
    int maxY = Integer.MIN_VALUE;

    //way one for iteration of Collections
    //Iterate shapes collection and for each shape:
    for (ShapeBase s : shapes) {
      int shapeX = s.getX();
      int shapeY = s.getY();
      int shapeX2 = shapeX + (int) s.getWidth();
      int shapeY2 = shapeY + (int) s.getHeight();

//      check if shape.x cooordinate is less than minX then minX = shape.x
//      check if shape.x cooordinate is more than maxX then maxX = shape.x + width
      if (shapeX < minX) {
        minX = shapeX;
      }
      if (shapeX2 > maxX) {
        maxX = shapeX2;
      }

//      check if shape.y cooordinate is less than minY then minY = shape.y
//      check if shape.y cooordinate is more than maxY then maxY = shape.y + height
      if (shapeY < minY) {
        minY = shapeY;
      }
      if (shapeY2 > maxY) {
        maxY = shapeY2;
      }
    }


    //Declare new collection for shapes called tmpShapes
    List<ShapeBase> tmpShapes = new ArrayList<>();
    //Declare int variables diffX and diffY and set values as absolute values of minX in minY
    int diffX = Math.abs(minX);
    int diffY = Math.abs(minY);

//    add diffX and diffY values to maxX and maxY
    maxX = Math.abs(maxX - minX);
    maxY = Math.abs(maxY - minY);

    //Iterate shapes collection and for each shape:
    for (ShapeBase s : shapes) {
      //Create new Shape named tmpShape and copy all data from iterated shape object  to this new tmpShape object
      ShapeBase tmpShape = new ShapeBase(s.getName(), s.getX(), s.getY(), s.getWidth(), s.getHeight());
      //    Recalculate tmpShape.x value like: tmpShape.x = tmpShape.x + diffX
      //    Recalculate tmpShape.y value like: tmpShape.y = tmpShape.y + diffY
      tmpShape.setX(tmpShape.getX() + diffX);
      tmpShape.setY(tmpShape.getY() + diffY);
      //Add tmpShape to tmpShapes collection
      tmpShapes.add(tmpShape);
    }

    //Declare two dimensional array names matrix of size maxY and maxY
    int[][] matrix = new int[(int) maxY][(int) maxX];
    for (int row = 0; row < maxY; row++) {
      for (int col = 0; col < maxX; col++) {
        //and fill it with int 0 in iteration
        matrix[row][col] = 0;
      }
    }

    //Iterate tmpShapes collection
    for (ShapeBase tmpShape : tmpShapes) {
      int x = (int) tmpShape.getX();
      int y = (int) tmpShape.getY();
      int x2 = (int) tmpShape.getX() + (int) tmpShape.getWidth();
      int y2 = (int) tmpShape.getY() + (int) tmpShape.getHeight();

      //Iterate from tmpShape.x to tmpShape.x + tmpShape.width as i
      for (int i = y; i < y2; i++) {
        //Iterate from tmpShape.y to tmpShape.y + tmpShape.height as j
        for (int j = x; j < x2; j++) {
          //set values for i and j in matrix array with value 1
          matrix[i][j] = 1;
        }
      }
    }
    this.shapeMatrix = matrix;
  }

  public int calculateShapeArea() {

  int area = 0;
  for (int k = 0; k < this.shapeMatrix.length; k++) {
    for(int l = 0; l < this.shapeMatrix[k].length; l++) {
      if(this.shapeMatrix[k][l] == 1) {
        area++;
      }
    }
  }
  return area;
  }

  public int countMatrix() {
    int count = 0;

    for (int k = 0; k < this.shapeMatrix.length; k++) {

      for (int l = 0; l < this.shapeMatrix[k].length; l++) {

        int value = this.shapeMatrix[k][l];

        //Top
        if (k > 0 && this.shapeMatrix[k - 1][l] == 1) {
          count++;
        }
        //Left
        if (l > 0 && this.shapeMatrix[k][l - 1] == 1) {
          count++;
        }
        //Bottom
        if (k < k - 1 && this.shapeMatrix[k + 1][l] == 1) {
          count++;
        }
        //Right
        if (l < l - 1 && this.shapeMatrix[k][l + 1] == 1) {
          count++;
        }
      }
    }
    return count;
  }
}

//ARCHIVE TEMPORARY DUMP
//protected int calculateShapeArea(Collection<ShapeBase> shapes) {
////    Declare new int variables minX and minY and set their values as max integers.
////      Declare new int variables maxX and maxY and set their values as min integers.
//  int minX = Integer.MAX_VAnew Matrix(Arrays.asList(shapes)).calculateShapeArea();LUE;
//  int minY = Integer.MAX_VALUE;
//  int maxX = Integer.MIN_VALUE;
//  int maxY = Integer.MIN_VALUE;
//
//  //way one for iteration of Collections
//  //Iterate shapes collection and for each shape:
//  for(ShapeBase s : shapes) {
//    int shapeX = s.getX();
//    int shapeY = s.getY();
//    int shapeX2 = shapeX + (int)s.getWidth();
//    int shapeY2 = shapeY + (int)s.getHeight();
//
////      check if shape.x cooordinate is less than minX then minX = shape.x
////      check if shape.x cooordinate is more than maxX then maxX = shape.x + width
//    if(shapeX < minX){
//      minX = shapeX;
//    }
//    if(shapeX2 > maxX) {
//      maxX = shapeX2;
//    }
//
////      check if shape.y cooordinate is less than minY then minY = shape.y
////      check if shape.y cooordinate is more than maxY then maxY = shape.y + height
//    if(shapeY < minY) {
//      minY = shapeY;
//    }
//    if(shapeY2 > maxY) {
//      maxY = shapeY2;
//    }
//  }
//
//
//  //Declare new collection for shapes called tmpShapes
//  List<ShapeBase> tmpShapes = new ArrayList<>();
//  //Declare int variables diffX and diffY and set values as absolute values of minX in minY
//  int diffX = Math.abs(minX);
//  int diffY = Math.abs(minY);
//
////    add diffX and diffY values to maxX and maxY
//  maxX =  Math.abs(maxX - minX);
//  maxY = Math.abs(maxY - minY);
//
//  //Iterate shapes collection and for each shape:
//  for(ShapeBase s : shapes){
//    //Create new Shape named tmpShape and copy all data from iterated shape object  to this new tmpShape object
//    ShapeBase tmpShape = new ShapeBase(s.getName(),s.getX(),s.getY(),s.getWidth(),s.getHeight());
//    //    Recalculate tmpShape.x value like: tmpShape.x = tmpShape.x + diffX
//    //    Recalculate tmpShape.y value like: tmpShape.y = tmpShape.y + diffY
//    tmpShape.setX(tmpShape.getX() + diffX);
//    tmpShape.setY(tmpShape.getY() + diffY);
//    //Add tmpShape to tmpShapes collection
//    tmpShapes.add(tmpShape);
//  }
//
//  //Declare two dimensional array names matrix of size maxY and maxY
//  int [][] matrix = new int[(int)maxY][(int)maxX];
//  for(int row = 0; row < maxY; row++){
//    for(int col = 0; col < maxX; col++){
//      //and fill it with int 0 in iteration
//      matrix[row][col] = 0;
//    }
//  }
//
//  //Iterate tmpShapes collection
//  for(ShapeBase tmpShape: tmpShapes) {
//    int x = (int) tmpShape.getX();
//    int y = (int) tmpShape.getY();
//    int x2 = (int) tmpShape.getX() + (int) tmpShape.getWidth();
//    int y2 = (int) tmpShape.getY() + (int) tmpShape.getHeight();
//
//    //Iterate from tmpShape.x to tmpShape.x + tmpShape.width as i
//    for (int i = y; i < y2; i++) {
//      //Iterate from tmpShape.y to tmpShape.y + tmpShape.height as j
//      for (int j = x; j < x2; j++) {
//        //set values for i and j in matrix array with value 1
//        matrix[i][j] = 1;
//      }
//    }
//  }
////TODO!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
//  int area = 0;
//  for (int k = 0; k < matrix.length; k++) {
//    for(int l = 0; l < matrix[k].length; l++) {
//      if(matrix[k][l] == 1) {
//        area++;
//      }
//    }
//  }
//  return area;
//}
//
//  protected int calculateShapesPerimeter(Collection<ShapeBase> shapes) {
//    int minX = Integer.MAX_VALUE;
//    int minY = Integer.MAX_VALUE;
//    int maxX = Integer.MIN_VALUE;
//    int maxY = Integer.MIN_VALUE;
//
//
//    for(ShapeBase s : shapes) {
//      int shapeX = s.getX();
//      int shapeY = s.getY();
//      int shapeX2 = shapeX + (int)s.getWidth();
//      int shapeY2 = shapeY + (int)s.getHeight();
//
//
//      if(shapeX < minX){
//        minX = shapeX;
//      }
//      if(shapeX2 > maxX) {
//        maxX = shapeX2;
//      }
//
//
//      if(shapeY < minY) {
//        minY = shapeY;
//      }
//      if(shapeY2 > maxY) {
//        maxY = shapeY2;
//      }
//    }
//
//
//    //Declare new collection for shapes called tmpShapes
//    List<ShapeBase> tmpShapes = new ArrayList<>();
//    //Declare int variables diffX and diffY and set values as absolute values of minX in minY
//    int diffX = Math.abs(minX);
//    int diffY = Math.abs(minY);
//
////    add diffX and diffY values to maxX and maxY
//    maxX =  Math.abs(maxX - minX);
//    maxY = Math.abs(maxY - minY);
//
//    //Iterate shapes collection and for each shape:
//    for(ShapeBase s : shapes){
//      //Create new Shape named tmpShape and copy all data from iterated shape object  to this new tmpShape object
//      ShapeBase tmpShape = new ShapeBase(s.getName(),s.getX(),s.getY(),s.getWidth(),s.getHeight());
//      //    Recalculate tmpShape.x value like: tmpShape.x = tmpShape.x + diffX
//      //    Recalculate tmpShape.y value like: tmpShape.y = tmpShape.y + diffY
//      tmpShape.setX(tmpShape.getX() + diffX);
//      tmpShape.setY(tmpShape.getY() + diffY);
//      //Add tmpShape to tmpShapes collection
//      tmpShapes.add(tmpShape);
//    }
//
//    //Declare two dimensional array names matrix of size maxY and maxY
//    int [][] matrix = new int[(int)maxY][(int)maxX];
//    for(int row = 0; row < maxY; row++){
//      for(int col = 0; col < maxX; col++){
//        //and fill it with int 0 in iteration
//        matrix[row][col] = 0;
//      }
//    }
//
//
//    //Iterate tmpShapes collection
//    for(ShapeBase tmpShape: tmpShapes) {
//      int x = (int) tmpShape.getX();
//      int y = (int) tmpShape.getY();
//      int x2 = (int) tmpShape.getX() + (int) tmpShape.getWidth();
//      int y2 = (int) tmpShape.getY() + (int) tmpShape.getHeight();
//
//      //Iterate from tmpShape.x to tmpShape.x + tmpShape.width as i
//      for (int i = y; i < y2; i++) {
//        //Iterate from tmpShape.y to tmpShape.y + tmpShape.height as j
//        for (int j = x; j < x2; j++) {
//          //set values for i and j in matrix array with value 1
//          matrix[i][j] = 1;
//        }
//      }
//    }
//
//    int perimeter = 0;
//
//    for (int k = 0; k < matrix.length; k++) {
//
//      for(int l = 0; l < matrix[k].length; l++) {
//        int x = k;
//        int y = l;
//        int x1 = x - 1;
//        int y1 = y;
//        int x2 = x - 1;
//        int y2 = y - 1;
//        int x3 = x + 1;
//        int y3 = y;
//        int x4 = x + 1;
//        int y4 = y + 1;
//
//        if(x >= 0 && y >= 0) {
//
//          perimeter++;
//        }
//      }
//    }
//    return perimeter;
//  }
//
//
//  protected int setupMatrix(ShapeBase[] shapes){
//
//    int sumAllCollidedShapesArea = 0;
//
//    //Setting the matrix from lowest x, y point to
//    // highest x, y point (x1,y1 - x2,y2)
//
//    // x + width
//    int maxX = Integer.MIN_VALUE;
//    // y + width
//    int maxY = Integer.MIN_VALUE;
//    // x
//    int minX = Integer.MAX_VALUE;
//    // y
//    int minY = Integer.MAX_VALUE;
//
//    //Offsetting minX and minY if minus to (0)x and (0)y
//    int offsetMinX = Integer.MAX_VALUE;
//    int offsetMinY = Integer.MAX_VALUE;
//    int offsetMaxX = Integer.MIN_VALUE;
//    int offsetMaxY = Integer.MIN_VALUE;
//
//    int[] bottomLeft = new int[2];
//    int[] topRight = new int[2];
//    int matrixWidth = 0;
//    int matrixHeight = 0;
//
//
//    int finalMatrixWidth = matrixWidth;
//    int finalMatrixHeight = matrixHeight;
//
//
//    for(int i = 0; i < shapes.length; i++) {
//      int shapeX  = shapes[i].getX();
//      int shapeY  = shapes[i].getY();
//      int shapeMaxX = (int) (shapes[i].getX() + shapes[i].getWidth());
//      int shapeMaxY = (int) (shapes[i].getY() + shapes[i].getHeight());
//
//      if(shapeX < 0) {
//        offsetMinX = 0;
//        offsetMaxX = offsetMinX + shapeMaxX;
//      }
//      if(shapeY < 0) {
//        offsetMinY = 0;
//        offsetMaxY = offsetMinY + shapeMaxX;
//      }
//      if(shapeX >= 0) {
//        offsetMinX = shapeX;
//        offsetMaxX =  shapeMaxX;
//      }
//      if(shapeY >= 0) {
//        offsetMinY = shapeY;
//        offsetMaxY =  shapeMaxY;
//      }
//
//      if(shapeMaxX > maxX) {
//        maxX = shapeMaxX;
//        topRight[0] = Math.abs(maxX);
//
//      }
//      if(shapeMaxY > maxY) {
//        maxY = shapeMaxY;
//        topRight[1] = Math.abs(maxY);
//      }
//      if(shapeX < minX) {
//        minX = shapeX;
//        bottomLeft[0] = Math.abs(minX);
//      }
//      if(shapeY < minY) {
//        minY = shapeY;
//        bottomLeft[1] = Math.abs(minY);
//      }
//      matrixWidth = bottomLeft[0] + topRight[0];
//      matrixHeight = bottomLeft[1] + topRight[1];
//    }
//
//
//    int [][] matrixOfAllShapes = new int[(int)matrixHeight][(int)matrixWidth];
//
//
//    for(int j = 0; j < matrixHeight; j++) {
//
//      System.out.print(j + ".. ");
//      for (int k = 0; k < matrixWidth; k++) {
//
//        matrixOfAllShapes[j][k] = 0;
//
//        System.out.print(matrixOfAllShapes[j][k]);
//      }
//      System.out.println();
//    }
//
//    return (matrixHeight * matrixWidth);
//
//  }

////    Declare new int variables minX and minY and set their values as max integers.
////      Declare new int variables maxX and maxY and set their values as min integers.
//    int minX = Integer.MAX_VALUE;
//    int minY = Integer.MAX_VALUE;
//    int maxX = Integer.MIN_VALUE;
//    int maxY = Integer.MIN_VALUE;
//
//    //way one for iteration of Collections
//    //Iterate shapes collection and for each shape:
//    for(ShapeBase s : shapes) {
//      int shapeX = s.getX();
//      int shapeY = s.getY();
//      int shapeX2 = shapeX + (int)s.getWidth();
//      int shapeY2 = shapeY + (int)s.getHeight();
//
////      check if shape.x cooordinate is less than minX then minX = shape.x
////      check if shape.x cooordinate is more than maxX then maxX = shape.x + width
//      if(shapeX < minX){
//        minX = shapeX;
//      }
//      if(shapeX2 > maxX) {
//        maxX = shapeX2;
//      }
//
////      check if shape.y cooordinate is less than minY then minY = shape.y
////      check if shape.y cooordinate is more than maxY then maxY = shape.y + height
//      if(shapeY < minY) {
//        minY = shapeY;
//      }
//      if(shapeY2 > maxY) {
//        maxY = shapeY2;
//      }
//    }
//
//
//    //Declare new collection for shapes called tmpShapes
//    List<ShapeBase> tmpShapes = new ArrayList<>();
//    //Declare int variables diffX and diffY and set values as absolute values of minX in minY
//    int diffX = Math.abs(minX);
//    int diffY = Math.abs(minY);
//
////    add diffX and diffY values to maxX and maxY
//    maxX =  Math.abs(maxX - minX);
//    maxY = Math.abs(maxY - minY);
//
//    //Iterate shapes collection and for each shape:
//    for(ShapeBase s : shapes){
//      //Create new Shape named tmpShape and copy all data from iterated shape object  to this new tmpShape object
//      ShapeBase tmpShape = new ShapeBase(s.getName(),s.getX(),s.getY(),s.getWidth(),s.getHeight());
//      //    Recalculate tmpShape.x value like: tmpShape.x = tmpShape.x + diffX
//      //    Recalculate tmpShape.y value like: tmpShape.y = tmpShape.y + diffY
//      tmpShape.setX(tmpShape.getX() + diffX);
//      tmpShape.setY(tmpShape.getY() + diffY);
//      //Add tmpShape to tmpShapes collection
//      tmpShapes.add(tmpShape);
//    }
//
//    //Declare two dimensional array names matrix of size maxY and maxY
//    int [][] matrix = new int[(int)maxY][(int)maxX];
//    for(int row = 0; row < maxY; row++){
//      for(int col = 0; col < maxX; col++){
//        //and fill it with int 0 in iteration
//        matrix[row][col] = 0;
//      }
//    }
//
//    //Iterate tmpShapes collection
//    for(ShapeBase tmpShape: tmpShapes) {
//      int x = (int) tmpShape.getX();
//      int y = (int) tmpShape.getY();
//      int x2 = (int) tmpShape.getX() + (int) tmpShape.getWidth();
//      int y2 = (int) tmpShape.getY() + (int) tmpShape.getHeight();
//
//      //Iterate from tmpShape.x to tmpShape.x + tmpShape.width as i
//      for (int i = y; i < y2; i++) {
//        //Iterate from tmpShape.y to tmpShape.y + tmpShape.height as j
//        for (int j = x; j < x2; j++) {
//          //set values for i and j in matrix array with value 1
//          matrix[i][j] = 1;
//        }
//      }/    Declare new int variables minX and minY and set their values as max integers.
//      Declare new int variables maxX and maxY and set their values as min integers.
//    int minX = Integer.MAX_VALUE;
//    int minY = Integer.MAX_VALUE;
//    int maxX = Integer.MIN_VALUE;
//    int maxY = Integer.MIN_VALUE;
//
//    //way one for iteration of Collections
//    //Iterate shapes collection and for each shape:
//    for(ShapeBase s : shapes) {
//      int shapeX = s.getX();
//      int shapeY = s.getY();
//      int shapeX2 = shapeX + (int)s.getWidth();
//      int shapeY2 = shapeY + (int)s.getHeight();
//
////      check if shape.x cooordinate is less than minX then minX = shape.x
////      check if shape.x cooordinate is more than maxX then maxX = shape.x + width
//      if(shapeX < minX){
//        minX = shapeX;
//      }
//      if(shapeX2 > maxX) {
//        maxX = shapeX2;
//      }
//
////      check if shape.y cooordinate is less than minY then minY = shape.y
////      check if shape.y cooordinate is more than maxY then maxY = shape.y + height
//      if(shapeY < minY) {
//        minY = shapeY;
//      }
//      if(shapeY2 > maxY) {
//        maxY = shapeY2;
//      }
//    }
//
//
//    //Declare new collection for shapes called tmpShapes
//    List<ShapeBase> tmpShapes = new ArrayList<>();
//    //Declare int variables diffX and diffY and set values as absolute values of minX in minY
//    int diffX = Math.abs(minX);
//    int diffY = Math.abs(minY);
//
////    add diffX and diffY values to maxX and maxY
//    maxX =  Math.abs(maxX - minX);
//    maxY = Math.abs(maxY - minY);
//
//    //Iterate shapes collection and for each shape:
//    for(ShapeBase s : shapes){
//      //Create new Shape named tmpShape and copy all data from iterated shape object  to this new tmpShape object
//      ShapeBase tmpShape = new ShapeBase(s.getName(),s.getX(),s.getY(),s.getWidth(),s.getHeight());
//      //    Recalculate tmpShape.x value like: tmpShape.x = tmpShape.x + diffX
//      //    Recalculate tmpShape.y value like: tmpShape.y = tmpShape.y + diffY
//      tmpShape.setX(tmpShape.getX() + diffX);
//      tmpShape.setY(tmpShape.getY() + diffY);
//      //Add tmpShape to tmpShapes collection
//      tmpShapes.add(tmpShape);
//    }
//
//    //Declare two dimensional array names matrix of size maxY and maxY
//    int [][] matrix = new int[(int)maxY][(int)maxX];
//    for(int row = 0; row < maxY; row++){
//      for(int col = 0; col < maxX; col++){
//        //and fill it with int 0 in iteration
//        matrix[row][col] = 0;
//      }
//    }
//
//    //Iterate tmpShapes collection
//    for(ShapeBase tmpShape: tmpShapes) {
//      int x = (int) tmpShape.getX();
//      int y = (int) tmpShape.getY();
//      int x2 = (int) tmpShape.getX() + (int) tmpShape.getWidth();
//      int y2 = (int) tmpShape.getY() + (int) tmpShape.getHeight();
//
//      //Iterate from tmpShape.x to tmpShape.x + tmpShape.width as i
//      for (int i = y; i < y2; i++) {
//        //Iterate from tmpShape.y to tmpShape.y + tmpShape.height as j
//        for (int j = x; j < x2; j++) {
//          //set values for i and j in matrix array with value 1
//          matrix[i][j] = 1;
//        }
//      }
//    }
//    }