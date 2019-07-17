package shapeFirstModel;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, Boolean filled, double radius, double height) {
        super(color, filled, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2+ super.getPerimeter()*this.height;
    }

    public double getVoid(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder- Area: "+getArea()+" Void: "+getVoid()
                +" color: "+getColor()+ (isFilled()?" filled":" not filled")
                +"\nSubclass of Circle with Area: "+super.getArea();
    }
}
