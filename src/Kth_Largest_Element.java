import java.util.PriorityQueue;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] nums={3,2,5,6,4};
        int k=2;
        System.out.print(findKthLargest(nums, k));

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();

    }

}
