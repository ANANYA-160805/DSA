public class LinearSearch {
    static void main(String[] args) {
        int[] arr={12,10,18,30};
        int target=18;
        int found= -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                found=i;
                break;
            }
        }
        if (found!=-1){
            System.out.println("element found at index "+ found);
        }else {
            System.out.println("element not found");
        }

    }
}
