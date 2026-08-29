import java.util.HashMap;
import java.util.Map;

public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        int n=4, d=333;
        System.out.println(fractionToDecimal(n,d));
    }
    public static String fractionToDecimal(int num, int den) {
        StringBuilder res = new StringBuilder();
        //handle negative
        if(num<0 ^ den<0){
            res.append("-");
        }
        long n=Math.abs((long)num);
        long d=Math.abs((long)den);

        res.append(n/d);
        //handle if num and den is completely divisible
        if(n%d==0){
            return res.toString();
        }
        res.append(".");

        Map<Long,Integer> mp=new HashMap<>();
        mp.put(n,res.length());
        while(n!=0){
            n=n*10;
            res.append(n/d);
            n=n%d;
            if(mp.containsKey(n)){
                int index=mp.get(n);
                res.insert(index, "(");
                res.append(")");
                break;
            } else {
                mp.put(n, res.length());
            }
        }
        return res.toString();
    }
}
