package Arithmetics.NthUglyNumber_264;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Solution {
    // bruteforce solution
    public int nthUglyNumber(final int n) {
        if (n == 1) {
            return 1;
        }

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            if (isUgly(i)) {
                a.add(i);
            }
            if (a.size() == n) {
                return a.get(n - 1);
            }
        }
        return -1;
    }

    public boolean isUgly(final int n) {
        if (n < 1) {
            return false;
        }

        int current = n;
        while (current % 2 == 0) {
            current /= 2;
        }
        while (current % 3 == 0) {
            current /= 3;
        }
        while (current % 5 == 0) {
            current /= 5;
        }
        return current == 1;
    }

    public int nthUglyNumber1(int n) {
        if(n<=0) return 0;
        int a=0,b=0,c=0;
        List<Integer> table = new ArrayList<>();
        table.add(1);
        while(table.size()<n) {
            int next_val = Math.min(table.get(a)*2,Math.min(table.get(b)*3,table.get(c)*5));
            table.add(next_val);
            if(table.get(a)*2==next_val) a++;
            if(table.get(b)*3==next_val) b++;
            if(table.get(c)*5==next_val) c++;
        }
        return table.get(table.size()-1);
    }
}