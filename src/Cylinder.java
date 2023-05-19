public class Cylinder extends  Circle{
    private double height;

    public Cylinder(){
    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(String color, double radius, double height){
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return getRadius() * getRadius() * 3.14 + 10;
    }

    //tinh the tich hinh tru
    public double getVolumeCylinder(){
        return getRadius() * getRadius() * this.height * 3.14;
    }

    @Override
    public String toString() {
        return "Cylinder {height = " + this.height + ", radius = " + getRadius() + ", color = " + getColor() +"}";
    }
}
