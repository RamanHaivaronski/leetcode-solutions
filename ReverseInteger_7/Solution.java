package ReverseInteger_7;

public class Solution {

    public int reverse(int x) {
        StringBuilder string = new StringBuilder();
        string.append(x);
        if (x < 0) {
            string.deleteCharAt(0);
        }
        string.reverse();
        int res = 0;
        try {
            res = Integer.parseInt(string.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        if (x < 0) {
            string.insert(0, '-');
            res = Integer.parseInt(string.toString());
        }
        return res;
    }

    public int traverseInt(int x) {
        int reversed = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x /= 10;

            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }

    public int reverse1(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0: (int) res;
    }

}


