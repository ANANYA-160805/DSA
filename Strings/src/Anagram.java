import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";

        System.out.println(anagram(s1,s2));


    }
    public static boolean anagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s1arr=s1.toCharArray();
        char[] s2arr=s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);


        for (int i = 0; i<s1arr.length ; i++) {
            if(s1arr[i]!=s2arr[i]){
                return false;
            }
        }
        return true;
    }
}
