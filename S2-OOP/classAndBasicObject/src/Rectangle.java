public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (this.height*this.width);
    }

    public double getPrimeter(){
        return (this.height+this.width)*2;
    }

    public String display(){
        return "Area is: "+getArea()+"\nPrimeter is: "+getPrimeter();
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println(rectangle.display());
    }

}
