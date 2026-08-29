import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_In_2_Arrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7};
        int[] res=union(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] union(int[] arr1, int[] arr2){
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            st.add(arr2[i]);
        }
        int[] res=new int[st.size()];
        int j=0;
        for(int num:st){
            res[j++]=num;
        }
        return res;
    }
}
