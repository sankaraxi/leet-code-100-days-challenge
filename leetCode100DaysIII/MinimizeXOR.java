package leetCode100DaysIII;
//https://leetcode.com/problems/minimize-xor/description/
public class MinimizeXOR {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 12;
        System.out.println(minimizeXOR(num1, num2));
    }

    public static int minimizeXOR(int num1, int num2) {
        int setBits = Integer.bitCount(num2);
        int result;
        for (result = 0; result <= num2; result++){
            int resultSetBits = Integer.bitCount(result);
            if((result ^ num1) <= num1 && resultSetBits == setBits) return result;
        }
        return 0;
    }
}
