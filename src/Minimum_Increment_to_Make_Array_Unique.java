import java.util.Arrays;

public class Minimum_Increment_to_Make_Array_Unique {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(nums));
    }
    public static  int minIncrementForUnique(int[] nums) {
        int i=0;
        int count = 0;
        while(i<nums.length){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i] == nums[j]){
                    nums[i]++;
                    count++;
                }
                
            }
        }
        return count;
    }
}
