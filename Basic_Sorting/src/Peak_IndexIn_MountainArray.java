public class Peak_IndexIn_MountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,0};
       int result=  peakIndexInMountainArray(arr);
       System.out.println(result);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int lo=1;
        int hi=arr.length-2;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[mid+1]&&arr[mid]<arr [mid-1]){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return-7;
    }

}
