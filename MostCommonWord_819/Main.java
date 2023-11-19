package MostCommonWord_819;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String result = s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});

        System.out.println(result);
    }
}