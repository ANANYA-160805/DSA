//Ques: Print _________ ‘n’ times. Take ‘n’ input from user

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter text:");
        String x = sc.nextLine();
        System.out.println("enter n");
        int n = sc.nextInt();
        for (int i= 1; i<=n ; i++) {
            System.out.println(x);

        }
    }
}
