package inheritance;

public class main1 {
    public static void main (String [] args) {
        Animal animal = new Animal("Mammal", "Large", 450);
        doanimalstuff(animal, "slow");

        Dog dog = new Dog();
        doanimalstuff(dog, "Fast");
        Dog yorkie = new Dog("yorkie", 15);
        doanimalstuff(yorkie, "fast");
        Dog retriver = new Dog("labrador retriever", 65, "wavy","swimmer");
        doanimalstuff(retriver, "slow");
        Dog wolf = new Dog("wolf", 40);
        doanimalstuff(wolf, "slow");
        fish goldie = new fish("goldie", 0.25, 2, 3);
        doanimalstuff(goldie, "fast");
    }
    public static void doanimalstuff(Animal animal, String speed) {
        animal.move(speed);
        animal.makenoise();
        System.out.println(animal);
        System.out.println("-------");

    }

}
