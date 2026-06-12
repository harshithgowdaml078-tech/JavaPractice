package inheritance;


    public class Cylinder extends Circle {

        private double Height;

        public Cylinder(double radius, double height) {
            super(radius);
            Height = height;
        }

        public double getHeight() {
            return Height;
        }

        public double getvolume() {
            return Height * getArea();
        }
    }

