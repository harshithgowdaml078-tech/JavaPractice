package inheritance;

public class Dog extends Animal{

    private String tailshape;
    private String earshape;

    public Dog() {
        super("German shepherd", "Large", 300);
    }



    public Dog(String type, double weight) {
        this(type, weight, "perky", "curled");
    }

    public Dog(String type, double weight, String tailshape, String earshape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.tailshape = tailshape;
        this.earshape = earshape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailshape='" + tailshape + '\'' +
                ", earshape='" + earshape + '\'' +
                "} " + super.toString();
    }
public void makenoise(){
if(type == "wolf") {
    System.out.print("ow woooo!");
}
bark();
System.out.println();
}

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("they bark wail their tail and ear");
        if (speed == "slow") {
            walk();
            wagtail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
        private void bark() {
            System.out.print(" woof! ");
        }
        private void run() {
            System.out.print(" Dog is running ");
        }
        private void walk() {
            System.out.print(" Dog walking ");
        }
        private void wagtail() {
            System.out.print(" tail wagging ");
        }
    }

