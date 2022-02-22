package shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase {

    public Rectangle(String name, int x, int y, double width, double height) {

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
        return height != width
                && calculatePerimeter() == 2 * (width + height)
                && height != 0
                && width != 0;
    }

    public boolean compareShapeIfEqual(Rectangle r2) {

        return this.calculateArea() == r2.calculateArea()
          && this.calculatePerimeter() == r2.calculatePerimeter()
          && r2.checkShape();
    }

    public boolean collisionDetection(Rectangle shape2) {
        return shape2.x + shape2.width > this.x
          && shape2.y + shape2.height > this.y
          && this.x + this.width > shape2.x
          && this.y + this.height > shape2.y;
    }
}

