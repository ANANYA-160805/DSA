import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] arr ={2,2,2,3,1,4,5};
        List<Integer> res= CyclicSort(arr);
        System.out.println(res);
    }

    private static List<Integer> CyclicSort(int[] arr) {
        int n = arr.length;
        List<Integer> ans= new ArrayList<>();
        int i=0;
        while(i<n){
            int idx = arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]){
                i++;
            }else{
                swap(arr, i, idx);
            }
        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]!=index+1){
                if(!ans.contains(arr[index])){
                    ans.add(arr[index]);
                }
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
