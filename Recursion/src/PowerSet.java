import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<String>();
        subset("",str,0,list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void subset(String ans, String str, int idx, List<String> list) {
        if (idx == str.length()) {
            if(ans.length()!=0){
                list.add(ans);
            }
            return;
        }
        char ch = str.charAt(idx);
        subset(ans+ch,str,idx+1,list);  //pick
        subset(ans,str,idx+1,list);  //skip
    }
}
