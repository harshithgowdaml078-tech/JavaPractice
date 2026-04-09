import java.util.Scanner;

public class sumANDaverage {
    public static void main(String[] args) {
        sumandaverage();
    }

    public static void sumandaverage() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter a number : ");

            if (input.hasNextInt()) {
                int num = input.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
        }
            long average = 0;
            if (count > 0) {
                average = Math.round((double) sum / count);
            }

            System.out.println("SUM = " + sum + " AVG = " + average);
        }


    }

