package leetCode100DaysIII;
//https://leetcode.com/problems/apply-operations-to-an-array/description/
import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        System.out.println(Arrays.toString(applyOperations(nums)));
    }
    public static int[] applyOperations(int[] nums) {
        int lastIndex = nums.length-1;
        int temp = 0;
        for (int i=0; i < nums.length; i++) {


            if(nums[i] > 0 && i+1 < nums.length && nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int  i = 0;
        int j = 0;
        while(j < nums.length){
            if(nums[j]!=0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
//        while(j < nums.length){
//            while(nums[i]!=0){
//                i++;
//            }
//            while(nums[j]==0){
//                j++;
//            }
//            nums[i] = nums[j];
//            nums[j] = temp;
//            i++;
//            j++;
//        }
        return nums;
    }
}
