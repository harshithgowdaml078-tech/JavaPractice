package inheritance;

public class Circle {

        private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getradius() {
        return radius;
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
