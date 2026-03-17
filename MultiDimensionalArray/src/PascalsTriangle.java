import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        PascalsTriangle obj = new PascalsTriangle();
        List<List<Integer>> result = obj.generate(n);
        System.out.println(result);
    }

        public List<List<Integer>> generate(int n) {
//        pascal triangle
//            T.c= o(n^2)
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0; i<n; i++){
                ans.add( new ArrayList<>());
                for(int j=0; j<=i; j++){
                    if(j==0 || j==i){
                        ans.get(i).add(1);
                    }else{
                        int val= ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                        ans.get(i).add(val);
                    }
                }
            }
            return ans;
        }
    }

