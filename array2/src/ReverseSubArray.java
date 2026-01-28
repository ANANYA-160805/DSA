import java.util.Arrays;
import java.util.Scanner;

public class ReverseSubArray {
   public static void ReverseArray(int[] arr) {
       int i=2;
       int j=5;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];;
           arr[j]=temp;
           i++;
           j--;
       }
       System.out.println(Arrays.toString(arr));
   }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        ReverseArray(arr);
    }
}
