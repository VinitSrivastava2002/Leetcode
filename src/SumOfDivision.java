public class SumOfDivision {
    public static void main(String[] args) {
        int n=3; //ans 8
        System.out.println(sumOfAllDivisors(n));
    }
    public static int sumOfAllDivisors(int n){
        int sum=0;

        for(int num=n;num>0;num--){
            int div=num;
            while(div!=0){
                if(num%div==0){
                    sum+=div;
                }
                div--;
            }
        }
        return sum;

    }
}
