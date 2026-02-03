import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
       int[] arr ={1,2,3,4,5,6,7,8,9,10};
//       move first two elements to the end of array
        int d=2;

       reverseArray(arr,0,d-1);
       reverseArray(arr,d,arr.length-1);
       reverseArray(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr , int i , int j){
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
    }
}
