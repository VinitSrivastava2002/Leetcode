import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4};
        System.out.println(triangleNumber1(nums));
    }
    // time complexity is n^2logn = nlog(n)(sorting) + log(n)binarysearch + n^2(loop)
    //space complexity is o(1)
    public static int triangleNumber(int[] nums) {
        int n=nums.length-1;
        int count =0;
        Arrays.sort(nums);
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int sum=nums[i]+nums[j];
                int index = search(j+1, n,nums, sum);

                count+= index-j;

            }
        }
        return count;

    }
    public static int search(int start, int end, int[] nums, int target){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target && (mid != end && nums[mid+1]>target)){
                return mid;
            }

            if(nums[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return end;
    }

    //time complexity n^2
    public static int triangleNumber1(int[] nums){
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--){
            int left=0, right=i-1;
            while(left<right){
                if(nums[left]+nums[right]> nums[i]){
                    count+= right-left;
                    right--;
                } else {
                    left++;
                }
            }
        }
        return count;
    }
}
