package PACKAGE_NAME;

public class Segregate0sAnd1s {
     public static void main(String[] args) {
        int[] arr ={0,0,1,1,1,1,0,1,0,1,1};
        int numberOf0s=0;
        int numberOf1s=0;
        for(int ele:arr){
            if(ele==0){
                numberOf0s++;
            }else{
                numberOf1s++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(i<numberOf0s){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

