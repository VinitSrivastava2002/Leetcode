import java.util.HashSet;
import java.util.Set;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }
    //bryteforce approach
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if(!st.contains(i)){
                return i;
            }
        }
        return -1;

    }
}
