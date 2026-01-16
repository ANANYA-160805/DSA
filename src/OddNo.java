class DigitSumDivisibleBy3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            int n = i;
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            if (sum % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
