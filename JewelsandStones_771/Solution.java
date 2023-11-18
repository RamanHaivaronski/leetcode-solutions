package JewelsandStones_771;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;

        char[] jewelArray = jewels.toCharArray();
        char[] stoneArray = stones.toCharArray();

        for(char stone: stoneArray) {
            for (char jewel: jewelArray) {
                if (stone == jewel) {
                    result++;
                }
            }
        }

        return result;
    }
}