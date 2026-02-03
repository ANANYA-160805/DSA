public class SortedArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i < arr.length ; i++) {
           if (arr[i]>arr[i+1]){
               System.out.println("Array is not sorted");
           }else{
               System.out.println("Array is sorted");
           }
        }
    }
}
