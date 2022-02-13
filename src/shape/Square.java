package shape;

import base.ShapeBase;

public class Square extends ShapeBase {

    public Square(String name, double width, double height) {
        super(name, width, height);

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

    @Override
    public double compareShape() {
        return 0;
    }

}
