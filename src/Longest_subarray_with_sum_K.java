import java.util.HashMap;
import java.util.Map;

public class Longest_subarray_with_sum_K {
    public static void main(String[] args) {
        int[] arr={1,-1,0};
        int k=0;
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] nums, int k) {
       Map<Integer, Integer> mp=new HashMap<>();
       mp.put(0,1);
       int sum=0;
       int count=0;
       for(int i=0;i<=nums.length-1;i++){
           sum+=nums[i];
           if(!mp.containsKey(sum-k)){
               mp.put(sum,1);
           } else {
               count+=mp.get(sum-k);
               mp.put(sum,mp.getOrDefault(sum-k,0)+1);
           }
       }
       return count;
    }
}
