package RemoveDuplicatesfromSortedArrayII_80;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int removeDuplicates1(int[] nums) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {

            int currValue = nums[j];
            int freq = 0;
            for (int i = 0; i < nums.length; i++) {

                if (freq >= 2 && nums[i] == currValue) {
                    nums[i + count] = nums[nums.length - 1 - count];
                    nums[nums.length - 1 - count] = 0;
                    count++;
                    freq = 0;
                    currValue = nums[i];
                    continue;
                }
                if (freq < 2 && nums[i] == currValue) {
                    freq++;
                }

            }
            j += count + 1;
        }


        int result = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == 0) {
                result++;
            }
            if (nums[i - 1] != 0) {
                break;
            }
        }

        Arrays.sort(nums, 0, nums.length - result);

        return nums.length - result;
    }

    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, n = nums.length, state = 0 ;

        while(j < n) {
            if(state == 0) {
                if(j < n-1 && nums[j] == nums[j+1]) {
                    state = 1;
                    nums[i] = nums[j];
                    nums[i+1] = nums[j] ;
                    i += 2;
                    j += 2;
                }
                else {
                    nums[i] = nums[j];
                    i++;
                    j++;
                }
            }
            else {
                if(nums[j] == nums[j-1]) {
                    j++;
                }
                else {
                    if(j<n-1 && nums[j]==nums[j+1]) {
                        nums[i] = nums[j] ;
                        nums[i+1] = nums[j] ;
                        i += 2;
                        j += 2;
                        state = 1;
                    }
                    else {
                        nums[i] = nums[j] ;
                        i++;
                        j++;
                    }
                }
            }
        }

        return i;
    }
}