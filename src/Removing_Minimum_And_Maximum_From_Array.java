public class Removing_Minimum_And_Maximum_From_Array {
    public static void main(String[] args) {
        int[] nums = {0,-4,19,1,8,-2,-3,5};
        System.out.println(minimumDeletions(nums));
    }
    public static int minimumDeletions(int[] nums) {
        int max_index=0;
        int min_index=0;

        //find max and min
        for(int i = 0; i < nums.length; i++){
            // min
            if(nums[i]<nums[min_index]){
                min_index=i;
            }
            // max
            if(nums[i]>nums[max_index]){
                max_index=i;
            }
        }

        int left = Math.min(min_index,max_index);
        int right = Math.max(min_index,max_index);

        // find min deletion

        int front = right+1;
        int back = nums.length-left;
        int front_back = (left+1) + (nums.length-right);

        return Math.min(front,Math.min(back,front_back));
    }
}
