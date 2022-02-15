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

    public boolean collisionDetection(Square shape2) {
        return super.collisionDetection(shape2);
    }

}
