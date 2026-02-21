import java.util.Arrays;

public class FirstOccurenceBinaySearch {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5,6};
        int target=2;
        System.out.println(Arrays.toString(arr));
        int result = binarySearch(arr, target);

        if(result != -1){
            System.out.println("First occurrence at index: " + result);
        } else {
            System.out.println("Element not found");
        }


    }
    public  static int binarySearch(int[] arr, int target){
        int low=0;
        int high= arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                idx=mid;
                high=mid-1;
            }
        }
        return idx;

    }
}
