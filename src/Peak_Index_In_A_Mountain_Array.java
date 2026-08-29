public class Peak_Index_In_A_Mountain_Array {
    public static void main(String[] args) {
        //Peak Index in a Mountain Array
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
            int s = 0;
            int e = arr.length-1;

            while(s<e){
                int  m = s+(e-s)/2;
                if(arr[m] < arr[m+1] ){
                    s=m+1;
                } else {
                    e=m;
                }
            }
            return s;
        }
    }
