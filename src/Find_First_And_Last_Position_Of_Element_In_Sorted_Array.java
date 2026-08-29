import java.util.Arrays;

public class Find_First_And_Last_Position_Of_Element_In_Sorted_Array {
    public static void main(String[] args) {
        // Find First and Last Position of Element in Sorted Array
        int[] arr={1};
        int target = 1;
        System.out.println(Arrays.toString(firstAndLastPosition(arr,target)));
    }
    public static int[] firstAndLastPosition(int[] arr, int target){
        int[] res={-1,-1};

        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] == target){
                int i=m;
                int j=m;
                while(arr[i-1] == target && i>=1){
                    i--;
                }
                res[0] = i;

                while(arr[j+1] == target && j<=arr.length-2){
                    j++;
                }
                res[1]=j;
                return res;
            }

            if(arr[m]<=target){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        return res;
    }
}
