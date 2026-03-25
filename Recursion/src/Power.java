import java.util.Scanner;
    public class Power {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Base");
            double a  = sc.nextDouble();
            System.out.println("Enter exponent");
            int b = sc.nextInt();
            System.out.println(a+" raised to the power "+b+" is "+myPow(a,b));

        }
        public static double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            return power(x, N);
        }
        public static double power(double x, long n){
            if(n==0)return 1;
            double call = power(x,n/2);
            if(n%2==0){
                return call*call;
            }else{
                return x*call*call;
            }
        }
    }


