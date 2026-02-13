public class Main
{
    public static void print (int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,0,1};
        int n = arr.length;
        print(arr);

//        for (int i = 0; i <n-1 ; i++) {
//            for (int j = 0; j <n-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//
//            }
//
//        }

//        worst case time complexity=> o(n^2)

         int swap=0;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;
        }

//        best case time complexity =>o(n)
        print(arr);
    }
}