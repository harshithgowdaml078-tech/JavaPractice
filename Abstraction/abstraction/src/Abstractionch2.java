public class Abstractionch2 {
    static void main(String[] args) {

        Bird bird = new Bird();
        Animal animal = bird;
        flightenabled flier = bird;
        tracker tracked = bird;

        //animal.move();
       // bird.fly();
        //bird.land();
       // bird.takeoff();
       // bird.track();
        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();
        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * flightenabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);
    }
}
