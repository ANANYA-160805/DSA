import java.util.Arrays;

public class LastOccurenceBinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5};
        int target=5;
        System.out.println(Arrays.toString(arr));
         int result =binarySearch(arr,target);
         if(result!=-1){
             System.out.println("last occurence at index:"+result);
         }else {
             System.out.println("last occurence not found");
         }
    }
    public static int binarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int idx=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else {
                idx=mid;
                low=mid+1;
            }
        }
        return idx;
    }

}
