public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(digit(4562));
    }

    static int digit(int n) {
        if(n > 0) {
          return digit(n / 10) + (n % 10);
        }
        return 0;


    }


}
