import java.util.ArrayList;

public class DemoB {
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

        EllipseB ellipse1 = new EllipseB("Ellipse 1", 1.5, 4);
        EllipseB ellipse2 = new EllipseB("Ellipse 2", 8, 3.8);
        shapes.add(ellipse1);
        shapes.add(ellipse2);

        CircleB circ1 = new CircleB("Circle 1", 5);
        CircleB circ2 = new CircleB("Circle 2", 6.6);
        shapes.add(circ1);
        shapes.add(circ2);

        TriangleB tri1 = new TriangleB("Triangle 1", 10, 10, 1);
        TriangleB tri2 = new TriangleB("Triangle 2", 10, 10, 1);
        shapes.add(tri1);
        shapes.add(tri2);

        EqualateralTriangleB eqTri1 = new EqualateralTriangleB("Equalaterla Triangle 1", 5);
        EqualateralTriangleB eqTri2 = new EqualateralTriangleB("Equalaterla Triangle 2", 15);
        shapes.add(eqTri1);
        shapes.add(eqTri2);

        printShapes(shapes);
        scaleShapes(shapes, 2);
        System.out.println();
        printShapes(shapes);
    }
}
