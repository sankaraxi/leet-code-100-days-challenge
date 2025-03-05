package leetCode100DaysIII;

public class CountTotalNumberofColoredCells {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(coloredCells(n));
    }

    public static long coloredCells(int n) {
        return (1 + (2 * ((long)(n) * (long)(n))) - (2 * (long)(n)));
    }

}
