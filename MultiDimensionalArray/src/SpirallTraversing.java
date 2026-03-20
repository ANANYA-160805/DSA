import java.util.ArrayList;
public class SpirallTraversing {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };
        ArrayList<Integer> result = traverse(arr);
        System.out.println(result);
    }
    public static ArrayList<Integer> traverse(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int fR=0;
        int fC=0;
        int lR=m-1;
        int lC=n-1;

        ArrayList<Integer> list = new ArrayList<>();
        while (fR <= lR && fC <= lC) {

            // Top Row
            for (int i = fC; i <= lC; i++) {
                list.add(arr[fR][i]);
            }
            fR++;

            // Right column
            for (int i = fR; i <= lR; i++) {
                list.add(arr[i][lC]);
            }
            lC--;

           //Bottom Row
            if (fR <= lR) {
                for (int i = lC; i >= fC; i--) {
                    list.add(arr[lR][i]);
                }
                lR--;
            }

//          Left Column
            if (fC <= lC) {
                for (int i = lR; i >= fR; i--) {
                    list.add(arr[i][fC]);
                }
                fC++;
            }
        }

      return list;
    }
}
