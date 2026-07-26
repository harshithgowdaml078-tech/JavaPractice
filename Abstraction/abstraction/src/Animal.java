enum Flightstages implements tracker {GROUNDED, LAUNCH, DATA, CRUISE_COLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Montoring " + this);
        }
    }
}
record Dragonfly (String name , String type) implements flightenabled {

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class satellite implements orbitearth {

    public void achieveorbit() {
        System.out.println("orbit is spinning");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface orbitearth extends flightenabled{
    void achieveorbit();
}
interface flightenabled{

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
     void takeoff();
     void land();
    void fly();
}
interface tracker{
    void track();
}
public class Animal {
    public static void move() {
        System.out.println("Flap Wings");
    }
}
