import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5;
        List<List<Integer>> list = new ArrayList<>();

        list = generate(row);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> ls, flag=null;
        for(int i=0;i<numRows;i++){
            ls = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ls.add(1);
                } else{
                    ls.add(flag.get(j-1)+flag.get(j));
                }
            }
            flag = ls;
            res.add(ls);
        }
        return res;
    }
}
