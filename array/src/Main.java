import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scanner.nextInt();

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
            System.out.println(2*arr[i]);
        }
    }
}