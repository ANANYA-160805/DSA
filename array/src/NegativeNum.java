import java.util.Scanner;

public class NegativeNum {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = Sc.nextInt();
         int[] arr= new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i <n ; i++) {
            arr[i]=Sc.nextInt();
        }
        System.out.print("negative num in given array:");
        for (int i = 0; i <n ; i++) {

            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }


        }

    }
}
