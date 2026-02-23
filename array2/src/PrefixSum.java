import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5};
        System.out.println(Arrays.toString(arr));
        int[] result = prefix(arr);
        System.out.println(Arrays.toString(result));

    }
    public static int[] prefix(int[] arr){

        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;

    }
}
