package utility;

import base.ShapeBase;

public class ShapeUtility {


  public ShapeUtility(ShapeBase[] shape) {


  }

  // TODO change!!!!!!!!!
  public double calculateAllShapesAreas(ShapeBase... shapes) {

    double arrArea = 0;
    for (int i = 0; i < shapes.length; i++){

      arrArea += shapes[i].calculateArea();
      return i;
    }
    return arrArea;
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


