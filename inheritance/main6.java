package inheritance;

public class main6 {
    static void main(String[] args) {
        PrinterClass print = new PrinterClass(50, true);

        int pagesprinted = print.printpages(7);
        System.out.println(" current job pages: %d, printer is: %d %n " + pagesprinted + print.getPagesprinted());

        pagesprinted = print.printpages(25);
        System.out.println(" duplex pages " + pagesprinted +print.getPagesprinted());


        System.out.println(" toner " + print.addtoner(57));
    }
}
