//Finding the Largest Even Number in an Array If no even number exists, return -1.//
public class LargestEvenInArray {
    public static int LargestEven(int[] arr){
        int maxEven=-1;
        for(int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                maxEven=arr[i];
            }
        }
        return maxEven;
    }
    public static void main(String[] args) {
        int[] arr={ 2,4,-1,6,8};
        int[] arr2={4,7,8,12,50};
        System.out.println(LargestEven(arr));
        System.out.println(LargestEven(arr2));
    }
}
