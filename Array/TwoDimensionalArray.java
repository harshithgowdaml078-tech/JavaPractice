package Array;

import java.util.Arrays;

public class TwoDimensionalArray {
    static void main(String[] args) {
        int[][] newarray = new int[5][5];
        System.out.println(Arrays.toString(newarray));
        System.out.println("newarray length = " + newarray.length);
        for(int[] outer : newarray) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < newarray.length; i++) {
            var innerarray = newarray[i];
            for(int j = 0; j < innerarray.length; j++) {
                newarray[i][j] = (i * 10) + (j * 1);
            }
        }

        System.out.println(Arrays.deepToString(newarray));

    }
}
