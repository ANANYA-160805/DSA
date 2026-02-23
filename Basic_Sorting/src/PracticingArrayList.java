import java.util.ArrayList;
import java.util.Arrays;

public class PracticingArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,5,5,5,5,6,8,9};
        int x = 5;
        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr, x));
    }

    static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(binarySearch(arr, x, true));   // first occurrence
        ans.add(binarySearch(arr, x, false));  // last occurrence
        return ans;
    }

    static int binarySearch(int[] arr, int x, boolean findFirst) {
        int lo = 0;
        int hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > x) {
                hi = mid - 1;
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                idx = mid;
                if (findFirst) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return idx;
    }
}