public class New {
    public static void main (String [] args) {
        Wall newdata = new Wall(7.6, 8.9);
        System.out.println("The area of the wall " + newdata.getArea());
        newdata.setHeight(1.5);
        System.out.println("The new Height of the wall " + newdata.getHeight());
        System.out.println("The new Width of the wall " + newdata.getWidth());
        System.out.println("The new area of the wall " + newdata.getArea());
    }
}
