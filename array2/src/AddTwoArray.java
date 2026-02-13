import java.util.Arrays;
public class AddTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {2, 1};
        int num1= addTwoArrays(arr1);
        int num2= addTwoArrays(arr2);
        System.out.println(num1+num2);
    }
    public static int addTwoArrays(int[] arr) {
        int num =0;
        for(int digit:arr){
            num=num*10+digit;
        }
        return num;
    }
}


