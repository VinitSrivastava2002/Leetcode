public class Maximum_Area_Of_Longest_Diagonal_Rectangle {
    public static void main(String[] args) {
        int[][] dimensions = {{10,3}, {5,9},{8,3}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double[] maxDiagonal = {0,0};
        for(int i=0;i<dimensions.length;i++){
            double diagonalsqrt = Math.pow((dimensions[i][0]),2) + Math.pow((dimensions[i][1]),2);
            double diagonal =Math.sqrt(diagonalsqrt);
            if(diagonal>maxDiagonal[1]){
                maxDiagonal[0] = i;
                maxDiagonal[1] = diagonal;
            }
        }
        // calculate area
        int index = (int)maxDiagonal[0];
        int areaOfRectangle= dimensions[index][0] * dimensions[index][1];
        return areaOfRectangle;
    }
}
