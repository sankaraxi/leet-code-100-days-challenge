package leetCode100Days;
//https://leetcode.com/problems/k-th-smallest-in-lexicographical-order/
public class KthElementInLexicoArray {
    public static void main(String[] args) {
        int n = 23;
        int k = 17;
        System.out.println(findKthNumber(n, k));
    }

    public static int findKthNumber(int n, int k) {
        int currentPrefix=1;
        k--;
        while (k>0) {
            int count=countNumbersWithPrefix(currentPrefix, n);
            if (k>=count) {
                currentPrefix++;
                k-=count;
            } else {
                currentPrefix*=10;
                k--;
            }
        }

        return currentPrefix;
    }

    private static int countNumbersWithPrefix(int prefix, int n) {
        long firstNumber=prefix,nextNumber=prefix+1;
        int totalCount=0;
        while (firstNumber<=n) {
            totalCount+=Math.min(n+1,nextNumber)-firstNumber;
            firstNumber*=10;
            nextNumber*=10;
        }
        return totalCount;
    }

//    public static int findKthNumber(int n, int k) {
//        // int[] lexicoArr = new int[n];
//        long curr = 1;
//        for (int i = 0; i < k; i++){
//            // lexicoArr[i] = curr;
//            if (k == (i+1)){
//                return (int)curr;
//            }
//
//            if (curr * 10 <= n){
//                curr = curr * 10;
//            }else{
//                while (curr % 10 == 9 || curr >= n){
//                    curr = curr / 10;
//                }
//                curr = curr + 1;
//            }
//        }
//
//        // return lexicoArr[k-1];
//        return -1;
//    }
}

