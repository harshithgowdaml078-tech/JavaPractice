public class Park  extends point {
    private String name;

    public Park(String name, String Location) {
        super(Location);
        this.name = name;
    }

    @Override
    public String toString() {

        return name + " National Park";
    }
}


