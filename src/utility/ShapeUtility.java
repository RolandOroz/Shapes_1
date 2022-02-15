package utility;

import base.ShapeBase;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ShapeUtility {


  public ShapeUtility(ShapeBase shape) {


  }

  public double calculateAllShapesAreas() {

return 0;
  }

  public double calculateAllShapesPerimeter() {
    return 0;
  }

  public double calculateAllCollidedShapesAreas(ShapeBase shape1, ShapeBase shape2) {

    if(shape1.collisionDetection() && shape2.collisionDetection()){
      return shape1.calculateArea() + shape2.calculateArea();
    } else {
    return 0;}
  }


    public double calculateAllCollidedShapesPerimeter() {
    return 0;
  }
}


