import java.util.*;

public class _4Sum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<ArrayList<Integer>> hSet = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                long target2= target - (nums[i] + nums[j]);
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    if((nums[k] + nums[l]) == target2){
                        ArrayList<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[k]);
                        ls.add(nums[l]);
                        if (!hSet.contains(ls)){
                            hSet.add(ls);
                            res.add(ls);
                        }
                        k++;
                        l--;
                    }
                    else if((nums[k] + nums[l]) < target2){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return res;
    }
}
