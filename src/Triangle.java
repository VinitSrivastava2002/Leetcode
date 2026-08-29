import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));

    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        int index=0;
        int level=1;
        sum+=triangle.get(0).get(0);
        while(level<triangle.size()){

            if(triangle.get(level).get(index)< triangle.get(level).get(index+1)){
                sum+=triangle.get(level).get(index);
            } else {
                sum+=triangle.get(level).get(index+1);
                index++;
            }

            level++;
        }
        return sum;
    }
}
