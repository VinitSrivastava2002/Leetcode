import java.util.Arrays;


public class Sorted_Square {
    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquare(arr)));

    }
    public static int[] sortedSquare(int[] nums){
        int[] res= new int[nums.length];
        int l=0, r=nums.length-1, sq=0;
        int i=nums.length-1;

        while (l<=r){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                sq=nums[l];
                l++;
            }
            else {
                sq =nums[r];
                r--;
            }
            res[i--] = sq *sq;
        }
        return res;

    }
}
