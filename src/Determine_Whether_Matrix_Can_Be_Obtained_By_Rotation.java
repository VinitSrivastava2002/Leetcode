public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation {
    public static void main(String[] args) {
        int[][] mat={{0,1},{1,1}};
        int[][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat,target));

    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int n=mat[0].length;
        //no of rotate;
        for(int rot=1;rot<=4;rot++){
            boolean isTrue=true;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j] != target[i][j]){
                        isTrue=false;
                        break;
                    }
                }
               if(!isTrue) break;
            }
            if(isTrue) return true;
            rotate(mat);
        }
        return false;
    }

    public static void rotate(int[][] mat){
        int n=mat[0].length;
        // transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]=temp;
            }
        }

        //reverse each array
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
    }
}
