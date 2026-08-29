import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        reverseArray(0,nums.length-1,nums);
        reverseArray(0,k-1,nums);
        reverseArray(k,nums.length-1,nums);
    }
    public static void reverseArray(int start, int end ,int[] nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
