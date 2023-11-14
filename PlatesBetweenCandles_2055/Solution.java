package PlatesBetweenCandles_2055;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] platesBetweenCandles1(String s, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            String temp = s.substring(queries[i][0], queries[i][1] + 1);
            if (temp.contains("|")) {
                int firstCandle = 0;
                int secondCandle = 0;
                for (int j = 0; j < temp.length(); j++) {
                    if (temp.charAt(j) == '|') {
                        firstCandle = j;
                        break;
                    }
                }
                for (int j = temp.length() - 1; j > 0; j--) {
                    if (temp.charAt(j) == '|' && j > firstCandle) {
                        secondCandle = j;
                        break;
                    }
                }
                String temp2 = temp.substring(firstCandle, secondCandle + 1);
                int countCandles = 0;
                for (int j = 0; j < temp2.length(); j++) {
                    if (temp2.charAt(j) == '*') {
                        countCandles++;
                    }
                }
                result[i] = countCandles;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {

        int[]  prefix = new int[s.length()];

        List<Integer> arr = new ArrayList<>();

        int index = 0;

        int[] ans = new int[queries.length];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '|') arr.add(i);
        }

        while(index < s.length() && s.charAt(index) != '|'){
            prefix[index] = 0;
            index++;
        }

        for(;index<s.length();index++){
            if(s.charAt(index) == '|'){
                prefix[index] = index-1>=0 ? prefix[index-1] : 0;
            }else{
                prefix[index] += index-1>=0 ? prefix[index-1] : 0;
                prefix[index] +=1;
            }
        }

        int i = 0;

        for(int[] q: queries){
            int last = bs(arr,q[1]);
            int start = bs(arr,q[0]);
            if(!arr.isEmpty()){
                if(last>=arr.size() || arr.get(last) != q[1]) last--;
                if(start >= arr.size()) start--;
            }


//             while(s.charAt(last) != '|'){
//                 last--;
//             }

//             while(s.charAt(start) != '|'){
//                 start++;
//             }

            if(last<0) last=0;

            if(!arr.isEmpty()) ans[i] = prefix[arr.get(last)]-prefix[arr.get(start)];
            if(ans[i]<0) ans[i]=0;
            i++;
        }

        return ans;

    }

    public int bs(List<Integer> ls, int target){
        int l =0;
        int h = ls.size();


        while(l<h){
            int m = l + (h-l)/2;
            if(ls.get(m) < target){
                l = m+1;
            }else{
                h = m;
            }
        }
        return l;
    }
}