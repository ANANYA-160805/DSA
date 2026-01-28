public class SecondMax {
    static void main(String[] args) {
        int[] arr={10,12,18,19,16};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
//        calculating maximum element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
// calculate second max
        for(int i=0;i<arr.length;i++){
            if (arr[i]>secondMax&&arr[i]!=max){
                secondMax=arr[i];
            }
        }
        System.out.println("The maximum element of an array is "+max);
        System.out.println("The second maximum element of an array is "+secondMax);
    }
}
