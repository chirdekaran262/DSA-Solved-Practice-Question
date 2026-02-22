import java.util.HashSet;

public class LongCon {
    public static void main(String[] args) {
        int[] arr = { 44, 21, 1, 5, 2, 8, 7, 4, 9, 10, 15, 5, 3, 11, 12, 13, 14 };
        int ans = longCon(arr);
        System.out.print("LongStrek of consecutive elements is " + ans);
    }

    public static int longCon(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int currentStreak = 1;
                while (set.contains(currentnum + 1)) {
                    currentnum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

}
