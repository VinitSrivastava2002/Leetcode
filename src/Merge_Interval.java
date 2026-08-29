import java.util.Arrays;

public class Merge_Interval {
    public static void main(String[] args) {
        int[][] interval= {{1,5},{3,7},{2,6},{4,8},{9,12}};
        System.out.println(Arrays.deepToString(merge(interval)));
    }
    public static int[][] merge(int[][] interval) {
        //sort by clumn in index 0
        sortByColumn(interval);
        int[][] result = new int[interval.length][2];
        int[] flag = new int[2];
        int k = 0;
        flag[0] = interval[0][0];
        for (int i = 0; i < interval.length-1; i++) {
           
            if (interval[i][1] < interval[i + 1][0]) {
                flag[1] = interval[i][1];
                result[k][0] = flag[0];
                result[k][1] = flag[1];
                flag[0]=interval[i][0];
                k++;
            }
        }
        return result;
    }

    public static void sortByColumn(int[][] arr) {
        int c = 0;
        Arrays.sort(arr, (x, y) -> Integer.compare(x[c], y[c]));
    }
}
