package CommonPrefix_14;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        FollowUpSolution f = new FollowUpSolution();

        String[] strs  = {"flow","flower","florist"};
        String result = f.longestCommonPrefix(strs);

        System.out.println(result);
    }
}