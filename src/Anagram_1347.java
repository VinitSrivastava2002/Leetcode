import java.util.Arrays;

public class Anagram_1347 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        System.out.println(minSteps(s,t));
    }
    static int minSteps(String s, String t) {
       int[] S=new int[26];
       int[] T=new int[26];

       for(char ch : s.toCharArray()){
           S[ch - 'a']++;
       }
       for(char ch : t.toCharArray()){
           T[ch - 'a']++;
       }

       int step=0;
       for(int i=0;i<26;i++) {
           step+=Math.abs(S[i] - T[i]);
       }
       return step/2;


    }
}
