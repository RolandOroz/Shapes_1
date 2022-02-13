package shape;

import base.ShapeBase;

public class Rectangle extends ShapeBase {

    public Rectangle(String name, double width, double height) {
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
        return height != width
                && calculatePerimeter() == 2 * (width + height)
                && height != 0
                && width != 0;
    }

    @Override
    public double compareShape() {
        return 0;
    }
}

