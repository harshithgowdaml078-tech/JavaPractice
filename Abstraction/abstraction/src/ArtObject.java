public class ArtObject extends productforsale {

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    void showdetails() {
        System.out.println("This " + type + " is a beautiful art object");
        System.out.printf("The price of a piece is %6.2f %n", price);
        System.out.println(description);

    }
}
