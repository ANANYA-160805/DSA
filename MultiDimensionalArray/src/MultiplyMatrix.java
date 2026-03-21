import java.util.ArrayList;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] a= {{1,1,1},{1,1,1},{1,1,1}};
        int[][] b = {{1,1,1},{1,1,1},{1,1,1}};

        ArrayList<ArrayList<Integer>> result = multiply(a,b);
        System.out.println(result);

    }
    public static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b){
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());

            for(int j=0; j<n;j++){
                int sum=0;
                for(int k=0; k<n; k++){
                    sum+=a[i][k]*b[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }
}
