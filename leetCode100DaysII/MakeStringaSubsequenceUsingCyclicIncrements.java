package leetCode100DaysII;

public class MakeStringaSubsequenceUsingCyclicIncrements {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";

        System.out.println(canMakeSubsequence(str1,str2));
    }
    public static boolean canMakeSubsequence(String str1, String str2) {
        if (str1.equals(str2))
            return true;
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            } else {
                int c1 = str1.charAt(i) - 'a';
                int c2 = str2.charAt(j) - 'a';
                if (c2 != (c1 + 1) % 26) {
                    i++;
                    continue;
                }
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}
