package inheritance;

public class main3 {
    static void main(String[] args) {
        Circle circle = new Circle(5.4);
        System.out.println(circle);
        System.out.println("Radius = " + circle.getradius());
        System.out.println("Area = " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.4, 2.4);
        System.out.println(cylinder);
        System.out.println("Height = " + cylinder.getHeight());
        System.out.println("Volume = " + cylinder.getvolume());
    }
}
