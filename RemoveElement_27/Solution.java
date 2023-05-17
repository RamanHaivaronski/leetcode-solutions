package RemoveElement_27;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    public int removeElement(int[] nums, int val) {

        List<Integer> test = new ArrayList<>(IntStream.of(nums).boxed().toList());
        for (int i = 0; i < test.size(); i++) {
            if (test.get(i) == val) {
                test.remove(i);
                i--;
            }
        }
        nums = convertIntegers(test);
        return nums.length;
    }


    static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}


