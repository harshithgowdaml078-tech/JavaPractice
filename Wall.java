public class Wall {
    private double Height;
    private double width;

    public Wall() {

    }

    public Wall(double height, double width) {
        Height = height;
        this.width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double Area = width * Height;
        return Area;
    }
}
