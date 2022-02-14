package base;



public class ShapeBase implements ShapeInterface {

    protected String name;
    protected double width;
    protected double height;
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int sideA;
    protected int sideB;
    protected int sideC;
    protected int sideD;
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

    public int getX1() {
        return x;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return (int) (x + height);
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return (int) (y2 + width);
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public void setSideD(int sideD) {
        this.sideD = sideD;
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
    public boolean collisionDetection() {
        return false;
    }

    public boolean compareShapeIfEqual() {
        return false;
    }


}
