public class StringReverse {
    public static void main(String[] args) {
        String str="hello world";
        StringBuilder sb =new StringBuilder(str);
        int i =0;
        int j=str.length()-1;

        while(i<=j){
            char temp1=str.charAt(i);
            char temp2=str.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
