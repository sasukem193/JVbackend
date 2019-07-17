package shapeFirstModel;

public class Circle extends Shape {
    private double radius=5;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle- Area: "+this.getArea()+" Perimeter: "+ getPerimeter()
                +" color: "+getColor()+ (isFilled()?" filled":" not filled")
                +"\nSubclass of Shape "+super.toString();
    }
}
