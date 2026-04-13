import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 5, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int n = arr.length;
        int i=0;

        while(i<arr.length){
            if(arr[i]==i+1 ){
                i++;
            }else{
                int idx=arr[i]-1;
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
    }
}