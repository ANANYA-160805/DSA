public class MinElemOfArray {
    public static void main(String[] args) {
        int[] arr ={4,8,6,7,12,5,3};
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("minimum element of array: "+ min);
    }
}
