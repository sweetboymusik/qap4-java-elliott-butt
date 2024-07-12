import java.util.ArrayList;

public class Demo {
    public static void scaleShapes(ArrayList<Scalable> shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }

    public static void printShapes(ArrayList<Scalable> shapes) {
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        ArrayList<Scalable> shapes = new ArrayList<>();

        Ellipse ellipse1 = new Ellipse("Ellipse 1", 1.5, 4);
        Ellipse ellipse2 = new Ellipse("Ellipse 2", 8, 3.8);
        shapes.add(ellipse1);
        shapes.add(ellipse2);

        Circle circ1 = new Circle("Circle 1", 5);
        Circle circ2 = new Circle("Circle 2", 6.6);
        shapes.add(circ1);
        shapes.add(circ2);

        Triangle tri1 = new Triangle("Triangle 1", 10, 10, 1);
        Triangle tri2 = new Triangle("Triangle 2", 10, 10, 1);
        shapes.add(tri1);
        shapes.add(tri2);

        EqualateralTriangle eqTri1 = new EqualateralTriangle("Equalaterla Triangle 1", 5);
        EqualateralTriangle eqTri2 = new EqualateralTriangle("Equalaterla Triangle 2", 15);
        shapes.add(eqTri1);
        shapes.add(eqTri2);

        printShapes(shapes);
        scaleShapes(shapes, 2);
        System.out.println();
        printShapes(shapes);
    }
}
