package WordSearch_79;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.exist(new char[][] {  {'A','B','C','E'}
                                                ,{'S','F','C','S'}
                                                ,{'A','D','E','E'}  } , "SEE");

        System.out.println(result);
    }
}