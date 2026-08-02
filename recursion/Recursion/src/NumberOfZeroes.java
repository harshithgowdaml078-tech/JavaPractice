public class NumberOfZeroes {
static int count = 0;
    static void main(String[] args) {
        noofzeroes(1200024);
        System.out.println(count);
    }

    static void noofzeroes(int n) {
        if (n == 0) {
            return;
        }
       int rem = n % 10;
        if(rem == 0) {
            count++;
        }
        noofzeroes(n / 10);
    }
}
