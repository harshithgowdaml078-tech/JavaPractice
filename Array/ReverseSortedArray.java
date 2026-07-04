package Array;

import java.util.Arrays;
import java.util.Random;
public class ReverseSortedArray {
    static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedaArray = sortIntegers(new int[]{56, 78, 43, 32, 77, 66});
        System.out.println(Arrays.toString(sortedaArray));

    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] randomarray = new int[len];
        for (int i = 0; i < len; i++) {
            randomarray[i] = random.nextInt(100);
        }
        return randomarray;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    flag = true;
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    System.out.println("-----> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("------> " + Arrays.toString(sortedArray));
        }
        return sortedArray;

    }
}

