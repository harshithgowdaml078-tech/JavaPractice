import java.util.Arrays;

public class TransactionHistory {
    public static int findlargesttransaction() {

        int[] transactions = {1000, 500, 2500, 750, 3000, 200, 1500, 800, 2000, 450};
        int max = transactions[0];
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > max) {
              max = transactions[i];
            }
        }
        return max;
    }
    public static int findsmallesttransaction() {

        int[] transactions = {1000, 500, 2500, 750, 3000, 200, 1500, 800, 2000, 450};
        int min = transactions[0];
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < min) {
                min = transactions[i];
            }
        }
        return min;
    }
    public static int findtotaltransaction() {
        int total = 0;
        int[] transactions = {1000, 500, 2500, 750, 3000, 200, 1500, 800, 2000, 450};
        for (int i = 0; i < transactions.length; i++) {
            total += transactions[i];
        }
        return total;
    }
    public static double findaverageoftransaction() {
        double average = 0.0;
        int[] transactions = {1000, 500, 2500, 750, 3000, 200, 1500, 800, 2000, 450};
        for (int i = 0; i < transactions.length; i++) {
           average += transactions[i] / transactions.length;
        }
        return average;
    }
    public static void reversetransactions() {
        int[] transactions = {1000, 500, 2500, 750, 3000, 200, 1500, 800, 2000, 450};
        for (int i = 0; i < transactions.length / 2; i++) {
           int temp = transactions[i];
           transactions[i] = transactions[transactions.length-1-i];
           transactions[transactions.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(transactions));
    }



    static void main(String[] args) {
        System.out.println(findlargesttransaction());
        System.out.println(findsmallesttransaction());
        System.out.println(findtotaltransaction());
        System.out.println(findaverageoftransaction());
        reversetransactions();
    }
}
