import java.util.Arrays;

public class Maximize_Happiness_of_Selected_Children {
    public static void main(String[] args) {
        int[] arr={4,3,2,5};
        int k=3;
        System.out.println(maximumHappinessSum(arr, k));

    }
    public static long maximumHappinessSum(int[] happiness, int k) {
        int len=happiness.length;
        long res=0;
        int j=0;
        Arrays.sort(happiness);
        for(int i=len-1;i>=len-k;--i){
            happiness[i] = Math.max(happiness[i] - j++, 0);
            res+=happiness[i];
        }
        return res;
    }
}
