public class Find_Dublicate_Number {
    public static void main(String[] args) {
        int[] nums= {1,3,2,4,2};
        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateByBooleanMethod(nums));
    }

    //by boolean method
    public static int findDuplicateByBooleanMethod(int[] nums){
        boolean[] bool = new boolean[nums.length];

        for(int i: nums){
            if(bool[i]==false){
                bool[i]=true;
            } else {
                return i;
            }
        }
        return -1;
    }
    //Optimize - fast and slow pointer floyd algo (cyclic tortoise)
    public static int findDuplicate(int[] nums){
        int slow=nums[0];
        int fast=nums[0];
        slow=nums[slow];
        fast=nums[nums[fast]];
        // detect it make cycle
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=nums[0];
        //find starting of cycle
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}
