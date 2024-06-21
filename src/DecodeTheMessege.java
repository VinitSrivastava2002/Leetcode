import java.util.*;

public class DecodeTheMessege {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
    public static String decodeMessage(String key, String message) {
        StringBuilder str=new StringBuilder();
        Map<Character,Character> hm=new HashMap<>();
        int inc=0;
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ' || hm.containsKey(key.charAt(i))){
                inc++;
                continue;
            }
            hm.put(key.charAt(i), (char)('a'+i-inc));
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                str.append(" ");
                continue;
            }
            str.append(hm.get(message.charAt(i)));

        }
        return str.toString();

    }

}
