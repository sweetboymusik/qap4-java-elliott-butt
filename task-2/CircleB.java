public class CircleB extends EllipseB {
    // instance variables
    double radius;

    // constructors
    public CircleB(String name, double radius) {
        super(name, radius, radius);
        this.radius = radius;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // methods
    @Override
    public double getPerimiter() {
        double perimiter = 2 * Math.PI * radius;
        return perimiter;
    }
}
