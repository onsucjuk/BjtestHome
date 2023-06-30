package leetcode;
import java.util.Arrays;
public class Ex_TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int i, j;
        int[] res = new int[2];
        int l = nums.length;
        for(i = 0; i < l; i++)
            for(j=i+1; j < l; j++) {
                if ((nums[i] + nums[j]) == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        Arrays.sort(res);
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {2,7,3,4};
        int[] res = twoSum(arr, 9);

        System.out.println(Arrays.toString(res));
    }
}
