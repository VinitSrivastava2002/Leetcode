import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeArrayEmpty {
    public static void main(String[] args) {
        int[] arr={14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations1(arr));
    }
    static int minOperations(int[] nums) {
        int res=0;
        int count=1;
        int k=0;
        Arrays.sort(nums);
        int[] nums2=new int[nums.length+1];
        for(int i:nums){
            nums2[k]=i;
            k++;
        }


        for(int i=0;i<nums2.length-1;i++){
            if(nums2[i]==nums2[i+1]){
                count++;
            }
            else{
                if(count % 2==0 && count % 3!=0){
                    count=count/2;
                    res+=count;
                    count=1;
                }
                else if(count % 3==0){
                    count=count/3;
                    res+=count;
                    count=1;
                }
                else{
                    return -1;
                }
            }
        }
        return res;
    }

    static int minOperations1(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int second;
        int result = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            second = entry.getValue();
            if (second == 1) {
                return -1;
            }
            if (second % 3 == 1) {
                result += (second / 3) - 1;
                result += 2;
            } else {
                result += (second / 3);
                result += ((second % 3) / 2);
            }
        }
        return result;
    }
}
