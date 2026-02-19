import java.util.Arrays;
import java.util.Scanner;
public class Segrwgate0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("enter the elements of the array");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        print(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void print(int[] arr){

        int zerosCount=0;
        int onesCount=0;
        int twoCount=0;
        for(int ele:arr){
            if(ele==0) {
                zerosCount++;
            }else if(ele==1){
                  onesCount++;
                }
            else{
                twoCount++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<zerosCount){
                arr[i]=0;

            }else if(i<zerosCount+onesCount){
                arr[i]=1;
            }else {
                arr[i]=2;
            }
        }
    }
}
