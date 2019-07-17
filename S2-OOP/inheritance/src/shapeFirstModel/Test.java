package shapeFirstModel;

public class Test {
    public static void main(String[] args) {

        Shape shape= new Shape();
        Circle circle= new Circle("red",false,5);

        System.out.println(shape);

        System.out.println(circle);

        System.out.println("----------");
        Cylinder cylinder=new Cylinder(10);
        System.out.println(cylinder);
    }
}
