package base;


public class ShapeBase implements ShapeInterface {

    protected String name;
    protected double width;
    protected double height;

    protected int x;
    protected int y;

    public ShapeBase(String name, int x, int y, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {

        return 0;
    }

    @Override
    public double calculatePerimeter() {

        return 0;
    }

    @Override
    public boolean checkShape() {

        return false;
    }

    @Override
    public boolean compareShapeIfEqual() {
        return false;
    }

    @Override
    public boolean collisionDetection() {
        return false;
    }

    public boolean collisionDetection(ShapeBase shape2) {
        return shape2.x + shape2.width > this.x
          && shape2.y + shape2.height > this.y
          && this.x + this.width > shape2.x
          && this.y + this.height > shape2.y;
    }


}
