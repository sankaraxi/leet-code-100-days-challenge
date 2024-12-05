package leetCode100DaysII;
//https://leetcode.com/problems/move-pieces-to-obtain-a-string/
public class MovePiecesToObtainAString {
    public static void main(String[] args) {
        String str1 = "_L__R__R_";
        String str2 = "L______RR";
        System.out.println(canChange(str1, str2));
    }

    public static boolean canChange(String start, String target) {
        int i = 0, j = 0, n = start.length();

        while (i < n || j < n) {
            while (i < n && start.charAt(i) == '_')
                i++;
            while (j < n && target.charAt(j) == '_')
                j++;

            if (i == n || j == n)
                break;
            if (start.charAt(i) != target.charAt(j))
                return false;
            if (start.charAt(i) == 'L' && i < j)
                return false;
            if (start.charAt(i) == 'R' && i > j)
                return false;

            i++;
            j++;
        }

        return i == n && j == n;
    }
}
