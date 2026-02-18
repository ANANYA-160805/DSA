import java.util.Arrays;

public class DecendingOnBubbleSort {
    public static void main(String[] args) {
        int[] arr={9 ,10, 11 ,1 ,26, 38};
        int n=arr.length;
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        printArray(arr, n);
        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int[] arr, int n){

        for (int i = 0; i <n-1 ; i++) {

            boolean isSorted=true;
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }
            }
            if(isSorted==true)break;

        }
    }
}
