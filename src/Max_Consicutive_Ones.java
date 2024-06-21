public class Max_Consicutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0 || i == nums.length-1){
                max = Math.max(max, count);
                count = 0;
            }
        }
        return  max;
    }
}
