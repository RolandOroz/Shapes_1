package comparer;

import base.ShapeBase;

public class CompareShape {
    private final ShapeBase base1;
    private final ShapeBase base2;

    public CompareShape (ShapeBase base1, ShapeBase base2) {
        this.base1 = base1;
        this.base2 = base2;
    }
    public void printShapeCompares() {
        if (base1.calculateArea() > base2.calculateArea()) {
            System.out.println(base1.getName()
                    + " is bigger than "
                    + base2.getName());
        } else if ( base1.calculateArea() < base2.calculateArea()) {
            System.out.println(base2.getName()
                    + " is bigger than "
                    + base1.getName());
        } else {
        System.out.println(base1.getName()
                + " is Equal To "
                + base2.getName());
        }
    }
}
