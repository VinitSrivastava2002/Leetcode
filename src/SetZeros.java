import java.util.ArrayList;
import java.util.Arrays;

public class SetZeros {
    public static void main(String[] args) {
        int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZero(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    //brute force approach -- using list
    public static void setZeroes(int[][] matrix){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int m=matrix.length-1; //row
        int n=matrix[0].length-1; //col

        for(int row=0;row<=m;row++){
            for(int col=0;col<=n;col++){
                if (matrix[row][col] == 0) {
                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(row);
                    temp.add(col);
                    arr.add(temp); // ✅ add the list of [row, col]
                }
            }
        }
        int i=0;
        while(i<=arr.size()-1){
            for(int row=0;row<=n;row++){
                matrix[arr.get(i).get(0)][row]=0;
            }
            for(int col=0;col<=m;col++){
                matrix[col][arr.get(i).get(1)]=0;
            }
            i++;
        }

    }

    // brutefore approach -- using array
    public static void setZeroes1(int[][] matrix){
        int m = matrix.length; //col
        int n = matrix[0].length; //row
        int[][] temp= new int[m][n];
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                temp[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
               if(temp[i][j] == 0){
                   for(int row=0;row<=n-1;row++){
                       matrix[i][row]=0;
                   }
                   for(int col=0;col<=m-1;col++){
                       matrix[col][j]=0;
                   }
               }
            }
        }


    }

    public static void setMatrixZero(int[][] matrix){
        //take two array row and col
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new  int[m];
        Arrays.fill(row, 1);
        int[] col = new int[n];
        Arrays.fill(col, 1);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(row[i]==0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
