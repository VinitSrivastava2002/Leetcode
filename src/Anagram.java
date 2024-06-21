import java.util.Arrays;

class Anagram {
    public static void main(String[] args) {
        String str1 = "listeneol";
        String str2 = "silentelo";
        System.out.print(anagram1(str1, str2));
    }
    public static boolean anagram(String str1, String str2){
        boolean[] bool = new boolean[26];
        //base cond
        if(str1.length() != str2.length()){
            return false;
        }

        for(int i=0;i<=str1.length()-1;i++){
            bool[str1.charAt(i) - 97] = true;
        }
        for(int j=0;j<str2.length();j++){
            bool[str2.charAt(j) - 97] = false;
        }

        for(int i=0;i<bool.length;i++){
            if(bool[i] == true){
                return false;
            }
        }
        return true;
    }

    public static boolean anagram1(String str1, String str2){
        //
        if(str1.length() != str2.length()){
            return false;
        }
        char[] str_i=str1.toCharArray();
        Arrays.sort(str_i);
        char[] str_j=str1.toCharArray();
        Arrays.sort(str_j);

        for(int i=0;i<str_i.length;i++){
            if(str_i[i] != str_j[i]){
                return false;
            }
        }
        return true;
    }
}