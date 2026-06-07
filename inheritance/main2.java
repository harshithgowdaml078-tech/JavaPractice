package inheritance;

public class main2 {
    public static void main(String [] args) {
        Employee Tim = new Employee("Tim", "06/06/1995", "05/05/2025");
        System.out.println(Tim);
        System.out.println("Age = " + Tim.getage());
        System.out.println("Pay = " + Tim.collectpay());
        SalariedEmployee jeffrey = new SalariedEmployee("jeffrey", "12/12/1984", "05/05/2025", 45000);
        System.out.println(jeffrey);
        System.out.println("Age = " + jeffrey.getage());
        System.out.println("Pay Check = $" + jeffrey.collectpay());
        jeffrey.retire();
        System.out.println("Pension check =$" + jeffrey.collectpay());
    }
}
