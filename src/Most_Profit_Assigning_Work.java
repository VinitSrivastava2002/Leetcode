import java.util.Arrays;

public class Most_Profit_Assigning_Work {
    public static void main(String[] args) {
        int[] difficulty = {2,4,6,8,10};
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));

    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int diffLength  = difficulty.length;
        int[][] arr = new int[diffLength][2];
        for(int i=0;i<diffLength;i++){
            arr[i][0] = difficulty[i];
            arr[i][1] = profit[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int maxProfit = 0;
        int i=0;
        while(i<worker.length){
            int sumProfit = 0;
            for(int j=0;j<arr.length;j++){

                if(worker[i] >= arr[j][0]){
                    sumProfit = Math.max(sumProfit, arr[j][1]);
                }
            }
            maxProfit += sumProfit;
            i++;
        }
        return maxProfit;
    }

}
