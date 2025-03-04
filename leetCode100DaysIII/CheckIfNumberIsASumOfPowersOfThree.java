package leetCode100DaysIII;
//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/
//Day004
public class CheckIfNumberIsASumOfPowersOfThree {
    public static void main(String[] args) {
        int n = 91;
//        double temp = 0;
//        int initialPower = 0;
//        while(temp < n){
//            temp = Math.pow(3,initialPower);
//            initialPower++;
//        }
//        System.out.println(initialPower);
        System.out.println(checkPowersOfThree(n));
    }

    public static boolean checkPowersOfThree(int n) {
        while(n > 0){
            int remainder = n % 3;
            if (remainder == 2) return false;
            n /= 3;
        }
        return true;
    }
}
