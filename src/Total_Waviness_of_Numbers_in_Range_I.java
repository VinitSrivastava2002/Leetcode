public class Total_Waviness_of_Numbers_in_Range_I {
    public static void main(String[] args) {
        int num1=120;
        int num2=130;
//        System.out.println(totalWaviness(num1, num2));
        System.out.println(totalWaviness1(num1,num2));
    }
    //bruteforce approach
    public static int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i=num1;i<=num2;i++){
            String st = Integer.toString(i);
            for(int j=1;j<=st.length()-2;j++){
                int left = st.charAt(j-1);
                int right = st.charAt(j+1);
                if(st.charAt(j)>left && st.charAt(j)>right){
                    count++;
                }
                if(st.charAt(j)<left && st.charAt(j)<right){
                    count++;
                }
            }
        }
        return count;
    }

    // more optimize way
    public static int totalWaviness1(int num1, int num2) {
        int res=0;
        for(int i=num1;i<=num2;i++){
            if(i<100) continue;
            res+=helper(i);
        }
        return res;
    }
    public static int helper(int num){
        int res=0;

        int last=num%10;
        num/=10;
        int curr=num%10;
        num/=10;

        while(num>0){
            int first=num%10;
            num/=10;

            //condition
            if((curr>first && curr>last) || (curr<first && curr<last)){
                res++;
            }
            last=curr;
            curr=first;
        }
        return res;
    }
}
