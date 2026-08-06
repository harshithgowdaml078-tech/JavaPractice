public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 90};
        System.out.println("the target element = " + findelement(arr, 87, 0));
    }

    static boolean findelement(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || findelement(arr, target, index + 1);
    }
}

