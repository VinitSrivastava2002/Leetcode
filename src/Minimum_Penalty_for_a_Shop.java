public class Minimum_Penalty_for_a_Shop {
    public static void main(String[] args) {
        String customers="YYNY";
        System.out.println(bestClosingTime(customers));
    }
    //Time complexity is O(n^2) brute force approach
    public static int bestClosingTime1(String customers){
        int n=customers.length();
        int time=0;
        int minPenality=Integer.MAX_VALUE;
        int res=0;
        while(time<=n){
            int penality=0;
            for(int i=0;i<n;i++){
                if(i<time && customers.charAt(i)=='N'){
                    penality++;
                }
                else if(i>=time && customers.charAt(i)=='Y'){
                    penality++;
                }
            }
            if(penality<minPenality){
                res=time;
                minPenality=penality;
            }
            time++;
        }
        return res;

    }

    //Time complexity is O(n) optimize approach
    public static int bestClosingTime(String customers){
        int bestTime=0;
        int prefix=0;
        int minPanelty=0;
        for(int i=0;i<customers.length();i++){
            char character=customers.charAt(i);

            prefix += character == 'Y'? -1:1;

            if(prefix<minPanelty){
                bestTime = i+1;
                minPanelty=prefix;
            }
        }
        return bestTime;
    }
}
