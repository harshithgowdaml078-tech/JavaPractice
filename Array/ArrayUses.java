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
