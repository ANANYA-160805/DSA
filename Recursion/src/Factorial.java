import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("factorial of "+ n +" is:");
       int result = factorial(n);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

}
