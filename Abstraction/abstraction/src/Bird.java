public class Bird extends Animal implements flightenabled, tracker {


    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName()+ " Ready to takeoff");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+ " Cleared to land");
    }

    @Override
    public void fly() {
          System.out.println(getClass().getSimpleName()+ " About to Fly");
    }

    @Override
    public void track() {
          System.out.println(getClass().getSimpleName()+ " Able to track");
    }
}
