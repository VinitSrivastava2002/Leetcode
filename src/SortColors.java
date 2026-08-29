import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int r=nums.length-1;
        while(m<=r){
            if(nums[m] == 0){
                swap(l,m,nums);
                m++;
                l++;
            } else if(nums[m] == 2){
                swap(r,m,nums);
                r--;
            } else{
                m++;
            }
        }
    }

    public static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
