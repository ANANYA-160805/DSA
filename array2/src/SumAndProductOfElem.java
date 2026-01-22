public class SumAndProductOfElem {
    public static void main(String[] args) {
        int[] arr ={2,6,4,-2,8};
        int sum =0;
        int product=1;
        for(int i = 0; i < arr.length ; i++) {
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println(sum);
        System.out.println(product);

    }
}
