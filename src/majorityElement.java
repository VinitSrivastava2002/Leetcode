import java.util.ArrayList;
import java.util.List;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr={1,2};
        System.out.println(majorityElement(arr));
    }
    public static List<Integer> majorityElement(int[] nums){
        int majEle1=0;
        int count1=0;

        int majEle2=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(majEle1==nums[i]){
                count1++;
            } else if(majEle2==nums[i]){
                count2++;
            } else if(count1==0){
                majEle1=nums[i];
                count1=1;
            } else if(count2==0){
                majEle2=nums[i];
                count2=1;
            } else {
                count1--;
                count2--;
            }
        }

        System.out.println(majEle1);
        System.out.println(majEle2);

        //verify
        List<Integer> ls=new ArrayList<>();
        int freq1=0;
        int freq2=0;
        for(int num:nums){
            if(num==majEle1){
                freq1++;
            } else if(num==majEle2){
                freq2++;
            }
        }

        if(freq1> Math.floor(nums.length/3)){
            ls.add(majEle1);
        }
        if(freq2>Math.floor(nums.length/3)){
            ls.add(majEle2);
        }
        return ls;
    }

}
