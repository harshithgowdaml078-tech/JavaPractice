public class RevFunc {
    static void main(String[] args) {
        revfunc(5);
    }
    static void revfunc(int n) {
        if(n == 0) {
            return;
        }

        revfunc(n - 1);
        System.out.println(n);
    }
}
