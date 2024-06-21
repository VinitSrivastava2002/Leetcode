public class Time_Needed_to_Buy_Tickets {
    public static void main(String[] args) {
        int[] tickets = {84,49,5,24,70,77,87,8};
        int k = 3;
        System.out.print(timeRequiredToBuy(tickets, k));
    }
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while(tickets[k]!=0){
            for(int i=0;i<tickets.length;i++){
                if(tickets[i] > 0){
                    tickets[i]--;
                    count++;
                }
            }
            tickets[k]--;
        }
        return count;
    }
}
