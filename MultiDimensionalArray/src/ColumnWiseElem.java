public class ColumnWiseElem {
    public static void main(String[] args) {
        int[][] arr = {{1,6,9,6},{2,5,7,8},{2,3,8,5}};

        for (int i = 0; i <arr[0].length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        }
    }

