import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit to reverse ");
        int n = sc.nextInt();
        int r =0;
         int sum =n;
        while(n!=0){

            r*=10;
            r+=n%10;

            n=n/10;


        }

        System.out.println(" reverse of "+"n " + "is"+" "+ r);
        System.out.println(sum+r);
    }
}
