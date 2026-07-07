package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    static void main(String[] args) {
        int[] minarray = readIntegers();
        System.out.println(Arrays.toString(minarray));

        int Minarray = findMin(minarray);
        System.out.println("min = " + Minarray);


    }

   private static int[] readIntegers(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter list of integers seperated by comma = ");
       String input = scanner.nextLine();

       String[] split = input.split(",");
       int[] values = new int[split.length];
       for(int i = 0; i < split.length; i++) {
           values[i] = Integer.parseInt(split[i].trim());

       }
       return values;
    }
    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int el : array) {
            if(el < min) {
                min = el;
            }
        }
        return min;
    }
}
