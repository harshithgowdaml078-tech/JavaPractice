import java.util.ArrayList;

public class Abstractionchallenge {
    private static ArrayList<productforsale> showitems = new ArrayList<>();

    public static void main(String[] args) {
        showitems.add(new ArtObject("Oil painting", 2000, "By JFK in 1950"));
        showitems.add(new ArtObject("Sculpture", 1500, "ABK in 1967"));
          detailshow();
    }

    public static void detailshow() {
        for (var item : showitems) {
            System.out.println("_".repeat(30));
            item.showdetails();
        }
    }
}
