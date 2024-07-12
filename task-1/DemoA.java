import java.util.ArrayList;

public class DemoA {
    public static void main(String[] args) {
        ArrayList<ShapeA> shapes = new ArrayList<>();

        EllipseA ellipse1 = new EllipseA("Ellipse 1", 1.5, 4);
        EllipseA ellipse2 = new EllipseA("Ellipse 2", 8, 3.8);
        shapes.add(ellipse1);
        shapes.add(ellipse2);

        CircleA circ1 = new CircleA("Circle 1", 5);
        CircleA circ2 = new CircleA("Circle 2", 6.6);
        shapes.add(circ1);
        shapes.add(circ2);

        TriangleA tri1 = new TriangleA("Triangle 1", 10, 10, 1);
        TriangleA tri2 = new TriangleA("Triangle 2", 10, 10, 1);
        shapes.add(tri1);
        shapes.add(tri2);

        EqualateralTriangleA eqTri1 = new EqualateralTriangleA("Equalaterla Triangle 1", 5);
        EqualateralTriangleA eqTri2 = new EqualateralTriangleA("Equalaterla Triangle 2", 15);
        shapes.add(eqTri1);
        shapes.add(eqTri2);

        for (ShapeA shape : shapes) {
            System.out.println(shape);
        }
    }
}
