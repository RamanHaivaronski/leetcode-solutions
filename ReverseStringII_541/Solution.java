package ReverseStringII_541;

public class Solution {
    public String reverseStr1(String s, int k) {
        StringBuilder sb;

        StringBuilder result = new StringBuilder();

        if (k >= s.length()) {
            return result.append(s).reverse().toString();
        }

        for (int i = 0; i < s.length(); i += 2 * k) {
            if (k > s.length() - result.length()) {
                sb = new StringBuilder(s.substring(i));
                result.append(sb.reverse());
                break;
            }
            if (2*k >= s.length() - result.length() || k <= s.length() - result.length()) {
                sb = new StringBuilder(s.substring(i, i + k));
                sb.reverse();
                result.append(sb);
                result.append(s.substring(result.length()));
                break;
            }
            sb = new StringBuilder(s.substring(i, i + k));
            sb.reverse();
            result.append(sb);
            if (result.length() + k >= s.length()) {
                result.append(s.substring(i + k));
                break;
            }
            result.append(s, result.length(), result.length() + k);
        }

        return  result.toString();
    }

    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i <= n-1; i += 2*k){
            if(i+k-1 <= n-1){
                reverseK(i,i+k-1,str);
            }else{
                //for fewer than k characters left (edge case)
                reverseK(i,n-1,str);
            }
        }
        String ans = new String(str);
        return ans;
    }
    public void reverseK(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}


