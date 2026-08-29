import java.util.Arrays;

public class Successful_Pairs_Of_Spells_And_Potions {
    public static void main(String[] args) {
        int[] spells = {3,1,2};
        int[] potions = {8,5,8};
        int success = 16;
        System.out.println(Arrays.toString(successfulPairs(spells,potions,success)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i <= spells.length - 1; i++) {
            int index = search(potions, success, spells[i]);
            if (index != -1) {
                res[i] = potions.length - index;
            }
        }
        return res;
    }

    public static int search(int[] potions, long success, int spell) {
        int s = 0;
        int e = potions.length - 1;
        int index=-1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if ((long)potions[m] * spell >= success) {
                index=m;
                e = m - 1;
            } else {
                s = m + 1;
            }

        }
        return index;
    }
}
