package shape;

import base.ShapeBase;

public class Square extends ShapeBase {

    public Square(String name, int x, int y, double width, double height) {
        super(name, x, y, width, height);

    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean checkShape() {
        return height == width
                && 4 * height % calculatePerimeter() == 0
                && 4 * width % calculatePerimeter() == 0
                && height != 0
                && width != 0;
    }


    public boolean compareShapeIfEqual(Square r2) {

        return this.calculateArea() == r2.calculateArea()
                && this.calculatePerimeter() == r2.calculatePerimeter()
                && r2.checkShape();
    }


    public boolean collisionDetection(Square s2) {
        if(this.getX1() < s2.getX2()
          && this.getX2() > s2.getX1()
          && this.getY1() < s2.getY2()
          && this.getY2() > s2.getY1()) {
            return true;
        }
        return  false;
    }
}
