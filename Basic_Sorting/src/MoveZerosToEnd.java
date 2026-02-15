import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={9,0,3,5,0,6,4,0,1,9,8};
        int n= arr.length;
        System.out.println(Arrays.toString(arr));
        Zeros(arr,n);

    }
    public static void Zeros(int[] arr, int n){
       int j =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
