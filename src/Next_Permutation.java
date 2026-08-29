import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int flag = -1;

        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                flag = i - 1;
                break;
            }
        }

        //swap
        if (flag != -1) {
            int swapIndex = flag;
            for (int j = nums.length - 1; j > flag; j--) {
                if (nums[j] > nums[flag]) {
                    swapIndex = j;
                    break;
                }
            }
            swap(flag, swapIndex, nums);
        }
        reverse(flag + 1, nums);

    }

    //swap
    public static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // Reverse helper
    public static void reverse(int start, int[] nums) {
        int end = nums.length - 1;
        while (start < end) {
            swap(start, end, nums);
            start++;
            end--;
        }
    }
}
