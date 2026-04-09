import java.util.Scanner;

public class ConsoleInput {
    public static void main(String [] args) {
        int currentYear = 2026;
        try {
            System.out.println(getinputfromconsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getinputfromscanner(currentYear));
        }
    }

    public static String getinputfromconsole(int currentyear) {
        String name = System.console().readLine("HI WHATS YOUR NAME!");
        System.out.println("THANKS " + name + " FOR TAKING OUR COURSE");

        String dateofbirth = System.console().readLine("WHAT YEAR WERE YOU BORN? ");
        int age = currentyear - Integer.parseInt(dateofbirth);
        return "YOU ARE " + age + " YEARS'S OLD";
    }
    public static String getinputfromscanner(int currentyear) {
        Scanner input = new Scanner(System.in);
        //String name = System.console().readLine("HI WHATS YOUR NAME!");
        System.out.println("WHAT IS YOUR NAME");
        String name = input.nextLine();
        System.out.println("THANKS " + name + " FOR TAKING OUR COURSE");

        //String dateofbirth = System.console().readLine("WHAT YEAR WERE YOU BORN? ");
        System.out.println("WHAT IS YOUR DATE OF BIRTH");
        boolean validDOB = false;
        int age = 0;
        do{
            System.out.println("choose your date of birth between " + (currentyear - 125) + " and " + currentyear);
            try {
                age = checkdata(currentyear, input.nextLine());
                validDOB = age < 0 ? false : true;
            } catch(NumberFormatException baddata) {
                System.out.println("Characters !! are not allowed");
            }

        }while(!validDOB);

        return "YOU ARE " + age + " YEARS'S OLD";
    }

    public static int checkdata(int currentyear, String dateofbith) {
        int dob = Integer.parseInt(dateofbith);
        int minimumyear = currentyear - dob;
        if((dob < minimumyear) || (dob > currentyear)) {
            return -1;
        }
        return(currentyear - dob);
    }
}
