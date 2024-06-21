import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {
    public static void main(String[] args) {
        int k = 2, w = 0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,1};
        System.out.println(findMaximizedCapital(k, w, profits, capital));
    }
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;

        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[0]));

        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((Collections.reverseOrder()));
        int i=0;
        while(k>0){
            while(i<n && arr[i][0]<=w){
                pq.add(arr[i][1]);
                i++;
            }

            if(!pq.isEmpty()){
                w += pq.poll();
            }
            k--;
        }
        return w;
    }
}
