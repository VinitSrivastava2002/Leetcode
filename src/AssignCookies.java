import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2,3}; //children
        int[] s = {1,1}; //cookies
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        if(g.length ==0 || s.length==0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int cookieIndex=s.length-1;
        int childIndex=g.length-1;
        int count=0;

        while (cookieIndex>=0 && childIndex>=0){
            if(s[cookieIndex]>=g[childIndex]){
                count++;
                cookieIndex--;
            }
            childIndex--;
        }
        return count;
    }
}
