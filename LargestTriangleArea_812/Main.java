package LargestTriangleArea_812;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        double result = s.largestTriangleArea(new int[][]{{0,0}, {0,1}, {1,0}, {0,2}, {2,0}});

        System.out.println(result);
    }
}