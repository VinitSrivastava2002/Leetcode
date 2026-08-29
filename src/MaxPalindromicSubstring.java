public class MaxPalindromicSubstring {
    public static void main(String[] args) {
        String s = "cbba";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int maxLen = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(i,j,s)){
                    if(maxLen<j-i+1){
                        maxLen = j-i+1;
                        index= i;
                    }
                }
            }
        }
        return s.substring(index, index+maxLen);
    }
    public static boolean isPalindrome(int l, int r, String s){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)==s.charAt(r)){
            return isPalindrome(l+1,r-1,s);
        }
        return false;
    }
}
