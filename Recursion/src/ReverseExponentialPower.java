public class ReverseExponentialPower {
    public static void main(String[] args) {
        int n =42;
        System.out.println( reverseExponentiation(n));
    }
        public static int reverseExponentiation(int n) {
            int rev = reverse(n);
            return power(n, rev);
        }

        public static int reverse(int n){
            int rev=0;
            while (n > 0) {
                int digit = n % 10;
                rev = rev * 10 + digit;
                n /= 10;
            }
            return rev;
        }

        public static int power(int x, int n) {
            if (n == 0) return 1;

            int half = power(x, n / 2);

            if (n % 2 == 0) {
                return half * half;
            } else {
                return x * half * half;
            }
        }

    }


