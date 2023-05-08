package RomanToInteger_13;

import java.util.HashMap;

public class MapSolution {
    //My solution brute force
    public int romanToInt(String s) {
        HashMap<Character, Integer> storeKeyValue = new HashMap<>();
        storeKeyValue.put('I', 1);
        storeKeyValue.put('V', 5);
        storeKeyValue.put('X', 10);
        storeKeyValue.put('L', 50);
        storeKeyValue.put('C', 100);
        storeKeyValue.put('D', 500);
        storeKeyValue.put('M', 1000);
        int integer = 0;
        integer += storeKeyValue.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if(storeKeyValue.get(s.charAt(i)) >= storeKeyValue.get(s.charAt(i-1)))
                integer += storeKeyValue.get(s.charAt(i));
            else
                integer -= storeKeyValue.get(s.charAt(i));
        }
        return integer;
    }
}