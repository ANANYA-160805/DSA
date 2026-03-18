public class searchMatrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (arr[i][j] > target) {
                j--;
            } else if (arr[i][j] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 5;

        searchMatrix obj = new searchMatrix();
        boolean result = obj.searchMatrix(arr, target);
        System.out.println(result);
    }
}