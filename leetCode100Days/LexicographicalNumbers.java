package leetCode100Days;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lexicographical-numbers/description/

public class LexicographicalNumbers {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int curr = 1;
        for (int i = 0; i < n; i++){
            ans.add(curr);

            if (curr*10 <= n){
                curr = curr * 10;
            }else{
                while (curr % 10 == 9 || curr >= n){
                    curr = curr / 10;
                }
                curr++;
            }
        }
        return ans;
    }
}
