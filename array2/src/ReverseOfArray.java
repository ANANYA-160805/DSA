import java.util.Arrays;

public class ReverseOfArray {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, -2, 45, 7, 3};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

}
