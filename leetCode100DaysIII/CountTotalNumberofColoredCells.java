package leetCode100DaysIII;
//https://leetcode.com/problems/count-total-number-of-colored-cells/description/
//Day005
public class CountTotalNumberofColoredCells {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(coloredCells(n));
    }

    public static long coloredCells(int n) {
        return (1 + (2 * ((long)(n) * (long)(n))) - (2 * (long)(n)));
    }

}
