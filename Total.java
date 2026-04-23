public class Total {
    public static void main(String [] args) {
        Floor newfloor = new Floor(4.5, 6.5);
        Carpet newcarpet = new Carpet(4.5);
        CostCalculator cost = new CostCalculator(newfloor, newcarpet);
        System.out.println("The area of floor is " + newfloor.getArea());
        System.out.println("The cost of carpet is " + newcarpet.getCost());
        System.out.println("The total cost is " + cost.getTotalCost());
    }
}
