package SortColors_75;
public class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int blue = 0;
        int white = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                blue++;
            } else {
                white++;
            }
        }
        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < blue; i++) {
            nums[red + i] = 1;
        }
        for (int i = 0; i < white; i++) {
            nums[red + blue + i] = 2;
        }
        System.out.println(nums);
    }
}