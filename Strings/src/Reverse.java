public class Reverse {
    public static void main(String[] args) {
//       a string s and an integer k, reverseing the first k characters
//       for every 2k characters counting from the start of the string

        String s ="abcdefg";
        int k =2;
        System.out.println(reverse(s,k));
    }
    public static String reverse(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        if(n==0){
            return s;
        }
        for (int i = 0; i < n; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n - 1);

            while(start<end){
                char temp1=s.charAt(start);
                char temp2=s.charAt(end);
                sb.setCharAt(start,temp2);
                sb.setCharAt(end,temp1);
                start++;
                end--;
            }
        }
        return sb.toString();
    }
}
