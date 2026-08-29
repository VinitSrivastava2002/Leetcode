import java.util.Arrays;

public class FindRepeatedOrMissingNo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(RepeatedOrMissingNo(nums)));
    }

    public static int[] RepeatedOrMissingNo(int[] nums){
        int n=nums.length;
        //find duplicate no
        int duplicateNo = findDuplicateByBooleanMethod(nums);

        // total sum
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        sum=sum-duplicateNo;
        int totalSum = n*(n+1)/2;

        return new int[]{duplicateNo, (totalSum-sum)} ;

    }

    public static int findDuplicateByBooleanMethod(int[] nums){
        boolean[] bool = new boolean[nums.length+1];

        for(int i: nums){
            if(bool[i]==false){
                bool[i]=true;
            } else {
                return i;
            }
        }
        return -1;
    }
}
