import java.util.*;

public class Divide_Array_Into_Arrays_With_Max_Difference {
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(Arrays.toString(divideArray(nums, k)));
    }
    public static int[][] divideArray(int[] nums, int k) {
        if(nums.length%3!=0){
            return new int[][] {};
        }
        Arrays.sort(nums);
        List<int[]> ls=new ArrayList<>();
        for(int i=2;i<nums.length;i+=3){
            if(nums[i]-nums[i-2]>k){
                return new int[][] {};
            }
            ls.add(new int[]{nums[i - 2], nums[i-1], nums[i]});
        }
        return ls.toArray(new int[ls.size()][]);
    }
}
