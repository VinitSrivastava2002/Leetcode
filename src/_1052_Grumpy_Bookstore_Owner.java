public class _1052_Grumpy_Bookstore_Owner {
    public static void main(String[] args) {
        int[] customers = {4,10,10};
        int[] grumpy = {1,1,0};
        int minutes = 2;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s = 0 , e = minutes - 1;
        int res = 0;
        int[] indexes = (maxSumIndexes(s, e, customers));

        for(int i=indexes[0];i<=indexes[1];i++){
            grumpy[i] = 0;
        }

        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i] == 0){
                res += customers[i];
            }
        }

        return res;

    }

    public static int[] maxSumIndexes(int s, int e, int[] customers){
        int max = 0;
        int [] indexes = new int[2];
        while(e < customers.length){
            int sum = 0;
            for(int i = s;i <= e;i++){
                sum += customers[i];
            }
            if(sum > max){
                max = sum;
                indexes[0] = s;
                indexes[1] = e;
            }
            s++;
            e++;
        }
        return indexes;
    }
}
