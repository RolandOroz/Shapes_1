package utility;

import base.ShapeBase;
import org.jetbrains.annotations.NotNull;

//Todo make init off shapes!!!!!

public class Matrix {
  Integer maximX;
  Integer maximY;
  Integer minimX;
  Integer minimY;
  Integer matrixHeight = null;
  Integer matrixWidth = null;

  private int maxX = Integer.MIN_VALUE;
  private int maxY = Integer.MIN_VALUE;


  protected void offsetPoint(ShapeBase @NotNull [] shapes){
    Integer offSetMinX = null;
    Integer offSetMinY = null;
    Integer offSetMaxX = null;
    Integer offSetMaxY = null;



    for(int i = 0; i < shapes.length; i++ ){
      int x = shapes[i].getX();
      int x2 = (int) (shapes[i].getX() + shapes[i].getWidth());
      int y = shapes[i].getY();
      int y2 = (int)(shapes[i].getY() + shapes[i].getHeight());


      offSetMinX = x - (x);
      minimX = offSetMinX;
      offSetMinY = y - (y);
      minimY = offSetMinY;
      offSetMaxX = offSetMinX + x2;
      offSetMaxY = offSetMinY + y2;
      matrixHeight = y2;
      maximY = offSetMaxY;
      matrixWidth = x2;
      maximX = offSetMaxX;
      if(x > this.maxX){
        this.maxX = x;
      }
      if(y > this.maxY){
        this.maxY = y;
      }
    }



  }

  protected void setPoints(ShapeBase[] shapes){
    int[][] matrix = new int[matrixWidth][matrixHeight];
  }



  public void displayMatrix(ShapeBase[] shapes){
    this.offsetPoint(shapes);
    this.setPoints(shapes);

    int[][] matrix = new int[matrixWidth][matrixHeight];

    for(int row = 0; row < matrix.length; row++) {

      System.out.print(row + ".. ");
      for (int col = 0; col < matrix[row].length; col++){
if(row == minimX && col == minimY)
        matrix[row][col] = 1;
//        matrix[maximX-1][maximY-1] = 1;
        System.out.print(matrix[row][col]);
      }
      System.out.println();
    }
  }

}
