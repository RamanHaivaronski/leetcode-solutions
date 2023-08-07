package Rotate_Array_189;

import java.util.ArrayList;
import java.util.List;

public class MapSolution {
    //My solution brute force
    public void rotate1(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();
        for (int elem: nums) {
            list.add(elem);
        }

        for (int i = 0; i < k; i++) {
            int temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, temp);
        }

        nums = list.stream().mapToInt(i -> i).toArray();
        System.out.println(nums);
    }

    public static void reverse(int[] nums,int start,int end){
        while(end>start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
}