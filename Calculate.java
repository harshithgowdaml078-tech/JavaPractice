public class Calculate {
    public static void main(String [] args) {
        Calculator calculator = new Calculator();
        calculator.setFirstnumber(79.6);
        calculator.setSecondnumber(36.8);
        System.out.println("the addition of two number = " + calculator.getadditionresult());
        System.out.println("the subtraction of two number = " + calculator.getsubtractionresult());
        System.out.println("the multiplication of two number = " + calculator.getmultiplicationresult());
        System.out.println("the addition of two number = " + calculator.getdevisionresult());
    }
}
