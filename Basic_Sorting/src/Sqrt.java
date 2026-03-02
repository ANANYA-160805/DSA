public class Sqrt {
    public static void main(String[] args) {
        int x =4;
      int result=  squareroot(x);
      System.out.println(result);
    }
    public static int squareroot(int x){
        int lo=0;
        int hi=x;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return x;
    }
}
