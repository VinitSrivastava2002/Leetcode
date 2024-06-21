public class Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        String[] str={"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(str));
    }
    public static String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPalindrome(s)==true){
                return s;
            }
        }
        return "";

    }

    //optimize approach
    static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // bruteforce approach
    static boolean isPalindrome1(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }
}
