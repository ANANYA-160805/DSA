import java.util.ArrayList;

public class GenerateParanthesis {
    public static void main(String[] args) {
        int n =3;
        ArrayList<String> ans= new ArrayList<String>();
        System.out.println(generate(n,0,0,"",ans));

    }

    private static ArrayList<String> generate(int n, int l, int r, String s, ArrayList<String> ans) {
        if(r==n) ans.add(s);

      if(l<n){
          generate(n,l+1,r,s+"(",ans);
      }
      if (r<l){
          generate(n,l,r+1,s+")",ans);
      }
        return ans;
    }

}
