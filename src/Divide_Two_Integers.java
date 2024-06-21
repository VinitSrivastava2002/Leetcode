public class Divide_Two_Integers {
    public static void main(String[] args) {
        int dividend = 27;
        int divisor = 3;
        System.out.println(divide1(dividend, divisor));
    }
//    public static int divide(long dividend, long divisor) {
//        boolean sign = ((dividend>=0) && (divisor>=0) || (dividend<0) && (divisor<0))? true:false;
//
//        dividend = Math.abs(dividend);
//        divisor = Math.abs(divisor);
//        int count = 0;
//        long temp = divisor;
//        long prev = 0;
//        while(dividend>divisor){
//            if(dividend>temp){
//                count++;
//                prev = temp;
//                temp = temp << 1;
//            }
//            else{
//                dividend = dividend - prev;
//                temp = divisor;
//            }
//        }
//        return sign? count:-(count);
//
//    }
    public static int divide1(int dividend, int divisor) {
        boolean sign = ((dividend>=0) && (divisor<=0) || (dividend<=0) && (divisor>=0))? false:true;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int res = 0;
//        base cond
        if(dividend ==1 && divisor == 1){
            return sign?1:-1;
        }
//        other cond
        if((res >= (1<<31)) && sign== true){
            return Integer.MAX_VALUE;
        }
        if((res >= (1<<31)) && sign== false){
            return Integer.MIN_VALUE;
        }
        while(dividend>=divisor){
            int count=0;
            while(dividend>=(divisor << (count +1))){
                count++;
            }
            res+=1<<count;
            dividend = dividend - divisor * (1<<count);
        }
        return sign?res:-res ;

    }
}
