import java.util.Arrays;

public class Cell_will_odd_values_in_Matrix {
    public static void main(String[] args) {
        int m=2, n=3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];

        for(int[] arr: indices){

            int first=arr[0];
            int second= arr[1];
            for(int j=0;j<n;j++){
                matrix[first][j]++;
            }
            for(int j=0;j<m;j++){
                matrix[j][second]++;
            }
        }

        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2 !=0){
                    count ++;
                }
            }
        }
        return count;
    }
}
