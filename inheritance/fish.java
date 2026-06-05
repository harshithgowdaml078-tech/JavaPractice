package inheritance;

public class fish extends Animal {
  private int fins;
  private int gills;

    public fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    public void makenoise() {
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        movemuscles();
        if(speed == "fast") {
            movebackfins();
        }
    }

    @Override
    public String toString() {
        return "fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }

    private void movemuscles() {
        System.out.print(" muscles moving ");
    }
    private void movebackfins() {
        System.out.print(" backfin moving ");
    }



}
