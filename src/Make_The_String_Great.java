import java.util.Stack;

public class Make_The_String_Great {
    public static void main(String[] args) {
        String s = "Pp";
        System.out.println(makeGood(s));
    }
    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        //base cond
        if(s.length() == 0 || st.isEmpty()){
            return "";
        }
        for(int i=1;i<s.length();i++){
            if((!st.isEmpty() && (st.peek() - s.charAt(i)) == 32)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String res = "";
        while(!st.isEmpty()){
            res = st.pop() + res;
        }
        return res;
    }
}
