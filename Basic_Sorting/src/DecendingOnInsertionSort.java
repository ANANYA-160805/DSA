import java.util.Arrays;
public class DecendingOnInsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,3,8};
        System.out.println(Arrays.toString(arr));
        print(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void print(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j =i;
           while(j>0&&arr[j]>arr[j-1]){
               int temp=arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
              j--;

           }
        }
    }
}
