
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println("i = " + i);
            System.out.println("Before: " + Arrays.toString(digits));

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                System.out.println("After increment: " + Arrays.toString(digits));
                return digits;
            }

            if (digits[i] == 9) {
                digits[i] = 0;
                System.out.println("After changing 9 to 0: "
                        + Arrays.toString(digits));
            }
        }

        int[] digit = new int[digits.length + 1];
        digit[0] = 1;
        return digit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);

        System.out.println("Final result: " + Arrays.toString(result));
    }
}

