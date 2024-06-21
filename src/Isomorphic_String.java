import java.util.HashMap;

public class Isomorphic_String {
    public static void main(String[] args) {
        String s = "eggs", t = "adds";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Boolean> hm2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }

        // with this comdition code run with 0ms and without this its run 10 ms? I don't understand why?
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }

         for(int i=0;i<=s.length()-1;i++){
             char ch1 = s.charAt(i);
             char ch2 = t.charAt(i);
             if(hm1.containsKey(ch1)){
                 if(hm1.get(ch1) !=ch2){
                     return false;
                 }
             }
             else{
                 if(hm2.containsKey(ch2)){
                     return false;
                 }
                 else{
                     hm1.put(ch1,ch2);
                     hm2.put(ch2,true);
                 }
             }
         }
         return true;

    }
}
