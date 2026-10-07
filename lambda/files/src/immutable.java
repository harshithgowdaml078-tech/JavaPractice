import java.util.Scanner;

public class immutable {
    static void main(String[] args) {
       int[] arr = new int[4];
       int key;
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();
        sc.nextLine();
        for(int i =0; i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
            if(key == arr[i]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
