public class SortedArray {
    public static void main(String [] args) {
          int[] arr = {1, 2, 3, 4, 15, 6};
          System.out.println("array is sorted = " + sortarray(arr, 0));
    }

    static boolean sortarray(int arr[], int index) {
        if(index == arr.length-1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sortarray(arr, index + 1);
    }
}
