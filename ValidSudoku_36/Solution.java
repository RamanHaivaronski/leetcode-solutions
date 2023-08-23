package ValidSudoku_36;

import java.util.*;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Integer> temp = new HashMap<>();

        //row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j]) && !temp.containsKey(board[i][j])) {
                    temp.put(board[i][j], 1);
                } else if (Character.isDigit(board[i][j]) && temp.containsKey(board[i][j])) {
                    return false;
                }
            }
            temp.clear();
        }


        //column
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[j][i]) && !temp.containsKey(board[j][i])) {
                    temp.put(board[j][i], 1);
                } else if (Character.isDigit(board[j][i]) && temp.containsKey(board[j][i])) {
                    return false;
                }
            }
            temp.clear();
        }

        List<Tuple<Integer, Integer, Integer, Integer>> tuple = new ArrayList<>();
        tuple.add(new Tuple<>(0,0, 3, 3));
        tuple.add(new Tuple<>(0,3, 3, 6));
        tuple.add(new Tuple<>(0, 6,3, 9));
        tuple.add(new Tuple<>(3, 0,6, 3));
        tuple.add(new Tuple<>(3,3, 6, 6));
        tuple.add(new Tuple<>(3,6, 6, 9));
        tuple.add(new Tuple<>(6,0, 9, 3));
        tuple.add(new Tuple<>(6,3, 9, 6));
        tuple.add(new Tuple<>(6, 6,9, 9));


        //3x3
        for (int k = 0; k < board.length; k++) {
            int s = tuple.get(k).getS();
            int t = tuple.get(k).getT();
            int i = tuple.get(k).getI();
            int j = tuple.get(k).getJ();

            //one 3x3 cell
            //row
            for (; s < i; s++) {
                for (; t < j; t++) {
                    if (Character.isDigit(board[s][t]) && !temp.containsKey(board[s][t])) {
                        temp.put(board[s][t], 1);
                    } else if (Character.isDigit(board[s][t]) && temp.containsKey(board[s][t])) {
                        return false;
                    }
                }
                t = tuple.get(k).getT();
            }
            temp.clear();

        }
        return true;
    }

    public class Tuple<S, T, I, J> {
        public final S s;
        public final T t;
        public final I i;
        public final J j;
        public Tuple(S s, T t, I i, J j) {
            this.s = s;
            this.t = t;
            this.i = i;
            this.j = j;
        }

        public S getS() {
            return s;
        }

        public T getT() {
            return t;
        }

        public I getI() {
            return i;
        }

        public J getJ() {
            return j;
        }
    }
}