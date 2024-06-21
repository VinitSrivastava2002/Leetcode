import java.util.Arrays;

public class Relative_Sort_Array {
    public static void main(String[] args) {
        int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = {2,42,38,0,43,21};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    static public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] temp = new int[1001];
        int arr2Index = 0;
        int resIndex = 0;
        int[] res = new int[arr1.length];


        for(int i=0;i<arr1.length;i++){
            temp[arr1[i]]++;
        }

        while(arr2Index<arr2.length){
            while(temp[arr2[arr2Index]]>0){
                res[resIndex++] = arr2[arr2Index];
                temp[arr2[arr2Index]]--;
            }
            arr2Index++;
        }

        for(int i=0;i<temp.length;i++){
            while(temp[i]!=0){
                res[resIndex++] = i;
                temp[i]--;
            }
        }
        return res;

    }
}
