package MultiplyStrings_43;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String multiply(String num1, String num2) {

        int resultInt = Integer.parseInt(num1) * Integer.parseInt(num2);

        return String.valueOf(resultInt);
    }
}