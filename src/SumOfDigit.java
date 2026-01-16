public class SumOfDigit {
    public static void main(String[] args) {

        for (int i = 11; i <=99 ; i+=2) {

            int tens =i/10;
            int ones = i%10;
            if (i%tens==0 && i%ones==0){
                System.out.println(i);
            }

        }
    }
}
