package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUses {
    static void main(String[] args) {
        int[] random = getRandomArray(10);
        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));
        int[] random2 = new int[10];
        System.out.println(Arrays.toString(random2));
        Arrays.fill(random2, 5);
        System.out.println(Arrays.toString(random2));
        int [] random3 = getRandomArray(8);
        System.out.println(Arrays.toString(random3));
        int [] random4 = Arrays.copyOf(random3, 8);
        System.out.println(Arrays.toString(random4));
        Arrays.sort(random4);
        System.out.println(Arrays.toString(random4));
        int[] smallerrandom = Arrays.copyOf(random4, 4);
        System.out.println(Arrays.toString(smallerrandom));

        int[] largerrandom = Arrays.copyOf(random4, 13);
        System.out.println(Arrays.toString(largerrandom));

        String[] sarray = new String[]{"John Snow", "Rhanaeyra Targaryen", "Tyrion Lannister", "Robb stark", "Alicent Hightower"};
        System.out.println(Arrays.toString(sarray));
        Arrays.sort(sarray);
        System.out.println(Arrays.toString(sarray));
        if(Arrays.binarySearch(sarray, "Tyrion Lannister") >=0) {
            System.out.println("The Powerfull always preyed on powerless to remain in power");
        }
        int[] a1 = {4, 5, 6, 8, 9};
        int[] a2 = {4, 5, 6, 8, 9};
        if(Arrays.equals(a1, a2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }


    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newint = new int[len];
        for(int i = 0; i < len; i++) {
            newint[i] = random.nextInt(100);
        }
            return newint;
    }
}
