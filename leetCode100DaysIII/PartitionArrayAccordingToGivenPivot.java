package leetCode100DaysIII;
//https://leetcode.com/problems/partition-array-according-to-given-pivot/
//Day003
import java.util.Arrays;


public class PartitionArrayAccordingToGivenPivot {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];

        int lessCount = 0;
        int equalCount = 0;
        int greaterCount = 0;

        for (int num : nums){
            if (num < pivot) lessCount++;
            else if(num == pivot) equalCount++;
            else greaterCount++;
        }

        int left = 0;
        int mid = lessCount;
        int right = lessCount + equalCount;

        // for (int num : nums){
        //     if(num < pivot) result[left++] = num;
        //     else if (num == pivot) result[mid++] = num;
        //     else result[right++] = num;
        // }

        for (int num : nums){
            if(num < pivot){
                result[left] = num;
                left++;
            }else if(num == pivot){
                result[mid] = num;
                mid++;
            }else{
                result[right] = num;
                right++;
            }
        }

        return result;
    }
}
