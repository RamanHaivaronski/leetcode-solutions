package BestTimetoBuyandSellStock_121;

import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int maxProfitNotOptimal(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int min = prices[0];
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        int max = 0;
        for (int i = minIndex; i < prices.length; i++){
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        if (max <= min) {
            return 0;
        } else {
            return max - min;
        }
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }

        return maxProfit;
    }

    public int maxProfitHashMap(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < prices.length; i++) {
            int maxDiff = 0;
            int currKey = prices[i];
            for (int j = i; j < prices.length; j++) {
                if (prices[j] - currKey > maxDiff) {
                    maxDiff = prices[j] - currKey;
                }
            }
            values.put(i, maxDiff);
        }
        return Collections.max(values.values());
    }


}