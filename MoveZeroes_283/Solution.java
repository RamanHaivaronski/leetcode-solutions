package MoveZeroes_283;

import java.util.Arrays;

class Solution {
    public void moveZeroes1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                // move to the left
                System.arraycopy(nums,i + 1, nums, i, nums.length - 1 - i);
                // delete last elem
                nums = Arrays.copyOf(nums, nums.length - 1);
                i = -1;
            }
        }
        for (int i = 0; i < count; i++) {
            //increase array and add 0 to the last elem
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[nums.length - 1] = 0;
        }

        System.out.println(nums);
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
}