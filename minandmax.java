import java.util.Scanner;

public class minandmax {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopcount = 0;
        while(true) {
            System.out.println("Enter any number or character : ");
            String nextentry = scanner.nextLine();
            try{
                double newentry = Double.parseDouble(nextentry);
                if(loopcount == 0 || newentry < min) {
                          min = newentry;
                }
                if(loopcount == 0 || newentry > max) {
                    max = newentry;
                }
                loopcount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if(loopcount > 0) {
            System.out.println("min = " + min + " max = " + max );
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
