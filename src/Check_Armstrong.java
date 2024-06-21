import java.util.Scanner;

public class Check_Armstrong {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int n=1634;
        System.out.println(checkArmstrong(n));

    }
    public static boolean checkArmstrong(int n){
        int temp=n;
        int sum=0;
        int len=Integer.toString(temp).length();
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,len);
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
