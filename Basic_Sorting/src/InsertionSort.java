public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,3,6,5,2,0,1};

        for (int i = 1; i < arr.length ; i++) {
            int j =i;
            while(j>0&& arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }

        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
