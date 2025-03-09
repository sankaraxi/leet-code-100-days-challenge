package leetCode100DaysIII;
//https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
//Day008
public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public static void main(String[] args) {

    }
    public static int minimumRecolors(String blocks, int k) {
        int blackCount = 0, ans = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {
            if (i - k >= 0 && blocks.charAt(i - k) == 'B') blackCount--;
            if (blocks.charAt(i) == 'B') blackCount++;
            ans = Math.min(ans, k - blackCount);
        }

        return ans;
    }
}
