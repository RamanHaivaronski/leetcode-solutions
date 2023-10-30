package TeemoAttacking_495;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 1) {
            return duration;
        }
        int sum = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i == timeSeries.length - 1) {
                sum += duration;
                break;
            }
            if (timeSeries[i + 1] - timeSeries[i] >= duration) {
                sum += duration;
            } else {
                sum += timeSeries[i + 1] - timeSeries[i];
            }
        }

        return sum;
    }
}