import java.util.ArrayList;
import java.util.Arrays;

public class SnakePattern {
    public static void main(String[] args) {
        int [][]arr = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        ArrayList<Integer> result = snakePattern(arr);
        System.out.println(result);


    }
    static ArrayList<Integer> snakePattern(int arr[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr[0].length;j++){
                    ans.add(arr[i][j]);
                }
            }else{
                for(int j=arr[0].length-1; j>=0;j--){
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }
}
