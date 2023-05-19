public class Circle {
    private double radius = 2;
    private String color;

    public Circle(){
    }
    public Circle(String color, double radius){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius * this.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = " + color +
                "}";
    }
}
