package leetCode100DaysIII;
//https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/description/
//Day002
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwo2DArraysBySummingValues {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        System.out.println(Arrays.deepToString(mergeArrays(nums1,nums2)));
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < nums1.length && j <nums2.length){
            if(nums1[i][0] == nums2[j][0]){
                result.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }else if (nums1[i][0] < nums2[j][0]){
                result.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }else{
                result.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }

        while(i < nums1.length){
            result.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }

        while(j < nums2.length){
            result.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }

        return result.toArray(new int[result.size()][]);
    }
}
