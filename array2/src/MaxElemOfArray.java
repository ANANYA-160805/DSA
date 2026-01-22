public class MaxElemOfArray {
    public static void main(String[] args) {
        int[] arr = {5,10,18,30,48,59,40,60,40,10};
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element of array: "+ max);
    }
}
