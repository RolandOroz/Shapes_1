package utility;

import base.ShapeBase;
import org.jetbrains.annotations.NotNull;

//Todo make init off shapes!!!!!

public class Matrix {
  Integer maximX;
  Integer maximY;
  Integer minimX;
  Integer minimY;

  private int maxX = Integer.MIN_VALUE;
  private int maxY = Integer.MIN_VALUE;


  protected void offsetPoint(ShapeBase[] shapes){
    Integer offSetMinX = null;
    Integer offSetMinY = null;
    Integer offSetMaxX = null;
    Integer offSetMaxY = null;
    Integer matrixHeight = null;
    Integer matrixWidth = null;


    for(int i = 0; i < shapes.length; i++ ){
      int x = shapes[i].getX();
      int x2 = (int) (shapes[i].getX() + shapes[i].getWidth());
      int y = shapes[i].getY();
      int y2 = (int)(shapes[i].getY() + shapes[i].getHeight());


      offSetMinX = x - (x);
      offSetMinY = y - (y);
      offSetMaxX = offSetMinX + x2;
      offSetMaxY = offSetMinY + y2;
      matrixHeight = y2;
      matrixWidth = x2;
      if(x > this.maxX){
        this.maxX = x;
      }
      if(y > this.maxY){
        this.maxY = y;
      }
    }
    int[][] matrix = new int[matrixWidth][matrixHeight];
  }

  protected void setPoints(ShapeBase[] shapes){
  }



  public void displayMatrix(ShapeBase[] shapes){
    this.offsetPoint(shapes);

    for(int i = 0; i < shapes.length; i++) {

    }
  }

}
