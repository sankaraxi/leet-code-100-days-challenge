package leetCode100DaysII;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i]){
                return true;
            }else{
                j--;
            }

            if (j == i){
                i++;
                j=arr.length-1;
            }
        }

        return false;
    }
}

