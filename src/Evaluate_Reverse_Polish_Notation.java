import java.util.*;
public class Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        String[] tokens={"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int temp;
        for(String s: tokens){
            if(s.equals("+")){
                st.add(st.pop() + st.pop());
            }
            else if(s.equals("-")){
                 temp=st.pop();
                st.add(st.pop() - temp);
            }
            else if(s.equals("*")){
                st.add(st.pop() * st.pop());
            }
            else if(s.equals("/")){
                temp=st.pop();
                st.add(st.pop() / temp);
            }
            else{
                st.add(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
