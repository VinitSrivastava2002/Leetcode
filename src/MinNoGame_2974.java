import java.util.*;

public class MinNoGame_2974 {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        System.out.println(Arrays.toString(numberGame(nums)));
    }
    public  static int[] numberGame(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        Arrays.sort(nums);
        int[] res=new int[nums.length];
        int j=0;
        for(int i=1;i<nums.length;i=i+2){
            res[j]=nums[i];
            res[j+1]=nums[i-1];
            j=j+2;
        }
        return res;









//        List<Integer> list=new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            list.add(i,nums[i]);
//        }
//        int[] res=new int[nums.length];
//        int A= list.get(0);
//        int B=list.get(1);
//        int i=0;
//        res[i]=B;
//        res[i+1]=A;
//


    }
}
