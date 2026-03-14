import java.util.Arrays;

public class MajorityElem {
    public static void main(String[] args) {
        int [] arr={1,2,2,1,2,2,1,1,1};
        int n=arr.length;
      int res=majority(arr,n);
        System.out.println(res);
    }

    private static int majority(int[] arr, int n) {

//        Brute force apporach - o(n^2)
//        for (int val:arr){
//            int freq=0;
//            for(int ele: arr){
//                if(ele==val){
//                    freq++;
//                }
//            }
//            if(freq>n/2){
//                return val;
//            }
//
//        }
//        return -1;

//        optimize - o(nlog n)
//        Arrays.sort(arr);
//        int freq = 1;
//        for(int i = 1; i < n; i++){
//            if(arr[i] == arr[i-1]){
//                freq++;
//            }else{
//                freq = 1;
//            }
//            if(freq > n/2){
//                return arr[i];
//            }
//        }
//        return -1;

//        Moore's voting algorithm - o(n)
        int freq=0,ans=0;
        for (int i = 0; i <n ; i++) {
            if(freq==0) {
                ans = arr[i];
            }
                if(ans==arr[i]){
                    freq++;
                }else{
                    freq--;
                }
        }
        int count=0;
        for(int val: arr){
            if(val==ans){
                count++;
            }
        }
        if(count > n/2){
            return ans;
        }
        return -1;
    }
}
