public class Main {
    public static void main(String[] args) {
       Circle circle = new Circle();
       Cylinder cylinder = new Cylinder(10);

        System.out.println(cylinder.getVolumeCylinder());
        System.out.println(circle.getArea());

        System.out.println(circle);
        System.out.println(cylinder);
    }
}