import java.util.Arrays;

public class FiveSort {
    public static void fiveSort(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[j] == 5) {
                j--;
            } else if (nums[i] != 5) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 12, 5, 1, 5, 12, 7, 5 };
        fiveSort(nums);
        System.out.println(Arrays.toString(nums)); // Output: [12, 7, 1, 12, 5, 5, 5]
    }
}
