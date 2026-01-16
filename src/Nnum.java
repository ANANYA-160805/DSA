import java.util.Scanner;

public class Nnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
        for (int j =n; j<=1; j++){
            System.out.println(j);
        }
    }
}
