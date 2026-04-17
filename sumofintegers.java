import java.util.Scanner;
public class sumofintegers{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        while(number <= 5) {
            System.out.println("Enter number" + number + ": ");
            String nextnumber = input.nextLine();
            try {
                int Number = Integer.parseInt(nextnumber);
                number++;
                sum += Number;
            } catch(NumberFormatException nfe) {
                System.out.println("Ivalid number");
            }
        }
        System.out.println("the sum of five numbers is " + sum);
    }
}

