public abstract class ShapeB implements Scalable {
    // instance variables
    String name;

    // constructors
    public ShapeB(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    abstract public double getPerimiter();

    abstract public double getArea();

    @Override
    public String toString() {
        return String.format("Name: %s, Area: %f, Perimiter: %f", this.name, this.getArea(), this.getPerimiter());
    }
}