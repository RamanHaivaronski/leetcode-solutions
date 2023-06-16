package Merge_Sorted_Array_88;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {

        int counter = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[counter];
            counter++;
        }

        //convert array of primitives to list
        List<Integer> output = new ArrayList<>();
        for (int value : nums1) {
            output.add(value);
        }
        Collections.sort(output);
        Arrays.setAll(nums1, output::get);
        //System.out.println(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // p1, p2 - pointers that mark the end of arrays
        // i the pointer to the index to which we insert
        int p1 = m-1 , p2 = n-1 ,i = m+n-1;

        // loop nums2 from behind
        while(p2 >=0){
            if(p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else{
                nums1[i--] = nums2[p2--];
            }
        }
    }
}