package StringtoInteger;

class Solution {
    public int myAtoi(String s) {
        int result = 0;

        boolean negative = false;
        StringBuilder number = new StringBuilder();
        s = s.trim();
        if (s.length() == 0) {
            return result;
        }
        if (s.length() == 1 && s.charAt(0) == '-') {
            return result;
        }

        
        if (s.charAt(0) == '-') {
            number.append(s.charAt(0));
            s = s.substring(1);
            negative = true;
        }

        boolean numberStarted = false;
        for (int i = 0; i < s.length(); i++) {
            boolean matches = String.valueOf(s.charAt(i)).matches("^[0-9]*$");
            if (!numberStarted && s.charAt(i) == '+') {
                continue;
            }
            if (!numberStarted && !matches) {
                return 0;
            }
            if (matches) {
                number.append(s.charAt(i));
                numberStarted = true;
            }
            if (!numberStarted) {
                continue;
            } 
            if (!matches) {
                break;
            }
        }

        try {
            result = Integer.parseInt(number.toString());
        } catch (NumberFormatException e) {
            if (negative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }


        return result;
    }
}