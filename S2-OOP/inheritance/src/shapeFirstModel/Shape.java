package shapeFirstModel;

public class Shape {
    private String color="Green";
    private Boolean filled= true;

    public Shape() {
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Shape- color: "+getColor()+ (isFilled()?" filled":" not filled");
    }
}
