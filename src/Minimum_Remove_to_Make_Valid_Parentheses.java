import java.util.Stack;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "a)b(c)d";
        System.out.println(minRemoveToMakeValid(s));
    }
    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=0;i<sb.length();i++) {
            if (sb.charAt(i) == '(') {
                st.push(i);
            }
            else if (sb.charAt(i) == ')') {
                if (!st.isEmpty() && sb.charAt(st.peek()) == '('){
                    st.pop();
                } else {
                    st.push(i);
                }
            }
        }
        while(!st.isEmpty()){
            int j = st.peek();
            sb.deleteCharAt(j);
            st.pop();
        }
        return sb.toString();
    }
}
