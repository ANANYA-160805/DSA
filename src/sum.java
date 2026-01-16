import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit  ");
        int n = sc.nextInt();
//        sum of numbers would zero initially
        int sum =0;
//        reverse
        int r =0;
        while(n!= 0){
            r*=10;
            r+=(n%10);
            sum+=(n%10);
            n=n/10;
        }
        System.out.println("sum="+sum);
        System.out.println("r= "+ r);

    }
}
