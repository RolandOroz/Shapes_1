package utility;

import base.ShapeBase;

public class Matrix {



  Integer maximX;
  Integer maximY;
  Integer minimX;
  Integer minimY;
  static int maxX = Integer.MIN_VALUE;
  static int maxY = Integer.MIN_VALUE;

  public static int offsetPoint(ShapeBase[] shapes){
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
      offSetMinY = y - (y);
      offSetMaxX = x2;
      offSetMaxY = y2;
      if(x > maxX){
        maxX = x;
      }
      if(y > maxY){
        maxY = y;
      }
    }

    return 0;
  }

  public static void displayMatrix(int m){

  }

}
