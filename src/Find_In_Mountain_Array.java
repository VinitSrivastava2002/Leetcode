interface MountainArray{
    public int get(int index);
    public int length();
}


// Dummy implementation to test locally
class TestMountainArray implements MountainArray {
    private int[] arr;

    public TestMountainArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

public class LeetCode1095 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,3,1};
        MountainArray mountain = new TestMountainArray(data);

        int target = 2;
        int index = findInMountainArray(target, mountain);
        System.out.println("Target " + target + " found at index: " + index);
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        // Find in Mountain Array
        int s = 0, e = mountainArr.length()-1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (mountainArr.get(m) < mountainArr.get(m + 1)) {
                s = m + 1;
            } else {
                e = m;
            }
        }
        int ans = accendSearch(s,target,mountainArr);
        if(ans == -1){
            int res = decendSearch(s,target,mountainArr);
            if(res != -1){
                return res;
            }
        } else{
            return ans;
        }
    return -1;
    }

    public static int accendSearch( int e, int target, MountainArray mountainArr){
        int s=0;
        while(s<=e){
            int m = s + (e - s) / 2;

            if(mountainArr.get(m)==target){
                return m;
            }
            if(mountainArr.get(m)<target){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        return -1;
    }

    public static int decendSearch( int s, int target, MountainArray mountainArr){
        int e=mountainArr.length()-1;
        while(s<=e){
            int m = s + (e - s) / 2;

            if(mountainArr.get(m)==target){
                return m;
            }
            if(mountainArr.get(m)>target){
                s=m+1;
            } else {
                e=m-1;
            }
        }
        return -1;
    }
}
