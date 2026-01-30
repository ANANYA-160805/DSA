import java.util.Arrays;
public class CheckEqual {
    static void main(String[] args) {
        int[]  a = {1,8,3,4,10,6,7,2,9,5};
        int[]  b = {4,2,7,1,8,6,7,5,9,10};

        System.out.println(equal(a,b));
    }
    public static boolean equal(int[] a,int[] b){
        if (a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

