import java.util.HashMap;
import java.util.Map;

public class SortByKeyValue {
    public static void main(String[] args) {
       Map<String, Integer> mp=new HashMap<>();
       mp.put("P001", 100);
       mp.put("P003", 300);
       mp.put("P002", 200);
       mp.put("P004", 100);

       for(Map.Entry<String, Integer> entry: mp.entrySet()){
           System.out.println(entry.getKey() + " and a value is " + entry.getValue());
       }
    }

//    public static String sort(Map<String, String> mp){
//
//    }

}
