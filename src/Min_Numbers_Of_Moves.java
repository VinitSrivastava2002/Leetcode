public class Min_Numbers_Of_Moves {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        System.out.println(minMovesToSeat(seats,students));
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        int sum = 0;
        for(int i=0;i<seats.length;i++){
            int Diff = 0;
            int min = Integer.MAX_VALUE;
            for(int j=0;j<students.length;j++){
                Diff = Math.abs(seats[i] - students[j]);
                min = Math.min(min, Diff);
            }
            sum += min;
        }
        return sum;
    }
}
