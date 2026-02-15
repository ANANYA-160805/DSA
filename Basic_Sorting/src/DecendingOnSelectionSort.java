import java.util.Arrays;

public class DecendingOnSelectionSort {
    public static void main(String[] args) {
        int[] arr={18 , 4 , 1 , 9 ,-3 , 6 , 33};
        System.out.println(Arrays.toString(arr));
        print(arr);
    }
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int max=Integer.MIN_VALUE;
            int index=-1;
            for (int j = i; j <n ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
