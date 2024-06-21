import java.util.Arrays;

public class Special_Array_With_X_Elements_Greater_Than_or_Equal_X {
    public static void main(String[] args) {
        int[] nums={3,5};
        System.out.println(specialArray(nums));
    }
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int x=0;
        while(x<=nums[nums.length-1]){
            int count=0;
            int max=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
            max=Math.max(max, count);
            if(max==x){
                return x;
            }
            x++;
        }
        return -1;
    }
}
