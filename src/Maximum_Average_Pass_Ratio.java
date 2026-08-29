public class Maximum_Average_Pass_Ratio {
    public static void main(String[] args) {
        int[][] classes = {{2,4},{3,9},{4,5},{2,10}};
        int extraStudents = 4;
        System.out.println(maxAverageRatio(classes,extraStudents));
    }
    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        while(extraStudents>0){
            double minRatio=Double.MAX_VALUE;;
            int minIndex=0;
            for(int i=0;i<=classes.length-1;i++){
                double ratio = (double)(classes[i][0]/classes[i][1]);
                if( ratio <minRatio){
                    minRatio= ratio;
                    minIndex=i;
                }
            }
            classes[minIndex][0]++;
            classes[minIndex][1]++;
            extraStudents--;
        }
        double res=0;
    for(int i=0;i<classes.length;i++){
        res+=(double)classes[i][0] / classes[i][1];
    }
    return res/ classes.length;
    }
}
