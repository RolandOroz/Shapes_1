package shape;

import base.ShapeBase;

public class Square extends ShapeBase {

    public Square(String name, double width, double height) {
        super(name, width, height);
        this.height = width;
    }

    @Override
    public double calculateArea() {
        return width * width;
    }

    @Override
    public double calculatePerimeter() {
        return 4 *  width;
    }
}
