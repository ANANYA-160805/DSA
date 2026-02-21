import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr= {9,9,9,9,9};
        int n = arr.length;
        int carry=1;

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry<=9){
                result.add(arr[i]+carry);
                carry=0;
            }else{
                result.add(0);
                carry=1;

            }
        }
        if(carry==1){
            result.add(1);
        }
        Collections.reverse(result);
        System.out.println(result);
    }

}
