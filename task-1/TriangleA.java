public class TriangleA extends ShapeA {
    // instance variables
    double side1;
    double side2;
    double side3;

    // constructors
    public TriangleA(String name, double side1, double side2, double side3) {
        super(name);

        boolean condition1 = (side1 + side2) > side3;
        boolean condition2 = (side3 + side1) > side2;
        boolean condition3 = (side2 + side3) > side1;

        if (condition1 && condition2 && condition3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.err.println("Side values are invalid. Exiting program.");
            System.exit(0);
        }
    }

    // getters and setters
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // methods
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));

        return area;
    }

    @Override
    public double getPerimiter() {
        double perimiter = side1 + side2 + side3;

        return perimiter;
    }
}
