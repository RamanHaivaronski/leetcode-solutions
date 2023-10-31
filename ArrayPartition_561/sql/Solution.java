package ArrayPartition_561.sql;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public int arrayPairSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int elem: nums){
            list.add(elem);
        }

        Collections.sort(list);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            i++;
        }

        return sum;
    }
}