import java.util.Arrays;
public class CheckEqual {
    static void main(String[] args) {
        int[]  a = {1,2,3,4,5,6,7,8,9,10};
        int[]  b = {1,2,3,4,5,6,7,8,10};

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

