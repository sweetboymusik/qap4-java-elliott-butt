public class Ellipse extends Shape {
    // instance variables
    double a;
    double b;

    // constructors
    public Ellipse(String name, double axis1, double axis2) {
        super(name);

        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.b = axis1;
            this.a = axis2;
        }
    }

    // getters and setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // methods
    @Override
    public double getPerimiter() {
        double perimiter;

        if (a == b) {
            perimiter = 2 * Math.PI * a;
        } else {
            double aSqrd = a * a;
            double bSqrd = b * b;
            double aMinusBSqrd = (a - b) * (a - b);

            perimiter = Math.PI * Math.sqrt(2 * ((aSqrd + bSqrd) - aMinusBSqrd) / 2);

        }

        return perimiter;
    }

    @Override
    public double getArea() {
        double area = Math.PI * a * b;
        return area;
    }
}
