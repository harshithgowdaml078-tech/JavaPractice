public class reverseNumber {


    static int sum = 0;
    static void rev(int n){
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n / 10);
    }
    static void main(String[] args) {
        rev(4567);
        System.out.println(sum);
    }
}
