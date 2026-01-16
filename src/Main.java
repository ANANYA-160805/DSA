import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first digit");
        int a = sc.nextInt();
        System.out.println("enter second digit");
        int b = sc.nextInt();
        System.out.println("enter third digit");
        int c = sc.nextInt();

   if(a==b && b==c){
       System.out.println("all digits are equal");
   } else if (a>=b && a>=c) {
       System.out.println("greatest digit is : " + a);

   }else if(b>=a && b>=c){
       System.out.println("greatest digit is :" + b);
   }else {
       System.out.println("greatest digit is :" + c);
   }

    }
}

