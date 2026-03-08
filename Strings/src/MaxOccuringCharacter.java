import java.util.Arrays;

public class MaxOccuringCharacter {
    public static void main(String[] args) {
     String s = "testsample";

        System.out.println(getMaxOccuringChar(s));
    }
    public static char getMaxOccuringChar(String s) {

//     Method-1 =>   brute force approach
//       int n=s.length();
//       int maxFreq=-1;
//       char ans=s.charAt(0);
//       for(int i=0;i<n;i++){
//           char ch =s.charAt(i);
//           int freq=0;
//           for(int j=i+1;j<n;j++){
//               if(ch==s.charAt(j)){
//                   freq++;
//               }
//               if(freq>maxFreq){
//                   maxFreq=freq;
//                   ans=ch;
//               }else if(freq==maxFreq&&ch<ans){
//                   ans=ch;
//               }
//           }
//       }
//     return ans;
//        time complexity=O(n^2)

//  Method-2 =>  Sliding Window Approach

//        int n = s.length();
//        int maxFreq = 0;
//        char ans=s.charAt(0);
//        char[] arr= s.toCharArray();
//        Arrays.sort(arr);
//
//        int i =0;
//        int j=0;
//
//        while(j<n){
//            if(arr[i]==arr[j])j++;
//            else{
//                int freq=  j-i;
//                if(freq>maxFreq){
//                    maxFreq=freq;
//                    ans=arr[i];
//                }
//                i=j;
//            }
//        }
//        int freq=  j-i;
//        if(freq>maxFreq){
//            maxFreq=freq;
//            ans=arr[i];
//        }
//        return ans;

//        Time Complexity -> o(n log n)

//        Method-3 Frequency Array

        int n=s.length();
      int[] freq = new int [26];
      for(int i =0; i<n; i++){
          char ch = s.charAt(i);
          int idx = ch - 'a';
          freq[idx]++;
      }
      int maxfreq=0;
      char ans = s.charAt(0);
      for(int i =0; i<n; i++){
          if(freq[i]>maxfreq){
              maxfreq=freq[i];
              ans= (char)(i+'a');
          }
      }
      return ans;

    }
}
