package TwoSum1;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] result = s.twoSumOptimal(new int[] {3,1,2,5,4}, 6);
        for (int j : result) {
            System.out.println(j);
        }
    }
}