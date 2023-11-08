package RobotReturntoOrigin_657;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean judgeCircle(String moves) {

        Map<Character, Integer> res = new HashMap<>();

        for (char elem: moves.toCharArray()) {
            res.put(elem, res.getOrDefault(elem, 0) + 1);
        }
        if (Objects.equals(res.get('U'), res.get('D')) && Objects.equals(res.get('R'), res.get('L'))) {
            return true;
        }

        return false;
    }
}