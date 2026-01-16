import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println(i);
            for (int j = 1; j <=o ; j++) {
                System.out.print("hey"+ j);

            }
            System.out.println();
        }
    }
}
