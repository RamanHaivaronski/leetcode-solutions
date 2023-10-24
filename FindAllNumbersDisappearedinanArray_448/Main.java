package FindAllNumbersDisappearedinanArray_448;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> result = s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});

        System.out.println(result);
    }
}