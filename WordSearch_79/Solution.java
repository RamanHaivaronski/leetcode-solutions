package WordSearch_79;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public boolean exist(char[][] board, String word) {
        boolean topUsed = false;
        boolean botUsed = false;
        boolean rightUsed = false;
        boolean leftUsed = false;

        int m = board.length - 1;
        int n = board[0].length - 1;

        int letterCounter = 0;

        int headCounter = 0;
        Map<Integer, List<List<Integer>>> headPositions = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(letterCounter) == board[i][j]) {
                    List<List<Integer>> toPut = headPositions.getOrDefault(headCounter, new ArrayList<>());
                    toPut.add(List.of(i, j));
                    headPositions.put(headCounter, toPut);
                    headCounter++;
                }
            }
        }
        if (headCounter == 0) {
            return false;
        }
        for (int i = 0; i < headCounter; i++) {
            topUsed = false;
            botUsed = false;
            leftUsed = false;
            rightUsed = false;

            int posX = headPositions.get(i).get(0).get(0);
            int posY = headPositions.get(i).get(0).get(1);
            letterCounter++;
            //top
            if (posX != 0) {
                if (word.charAt(letterCounter) == board[posX - 1][posY] &&
                    !headPositions.containsValue(List.of(List.of(posX - 1, posY)))) {
                    List<List<Integer>> toPut = headPositions.getOrDefault(i, new ArrayList<>());
                    toPut.add(List.of(posX - 1, posY));
                    headPositions.put(i, toPut);

                    i--;
                    topUsed = true;
                }
            }
            // bot
            if (posX != m) {
                if (word.charAt(letterCounter) == board[posX + 1][posY] &&
                        !headPositions.containsValue(List.of(List.of(posX + 1, posY)))) {
                    List<List<Integer>> toPut = headPositions.getOrDefault(i, new ArrayList<>());
                    toPut.add(List.of(posX + 1, posY));
                    headPositions.put(i, toPut);

                    i--;
                    botUsed = true;
                }
            }
            // left
            if (posY != 0) {
                if (word.charAt(letterCounter) == board[posX][posY - 1] &&
                        !headPositions.containsValue(List.of(List.of(posX, posY - 1)))) {
                    List<List<Integer>> toPut = headPositions.getOrDefault(i, new ArrayList<>());
                    toPut.add(List.of(posX, posY - 1));
                    headPositions.put(i, toPut);

                    i--;
                    leftUsed = true;
                }
            }
            //right
            if (posY != n) {
                if (word.charAt(letterCounter) == board[posX][posY + 1] &&
                        !headPositions.containsValue(List.of(List.of(posX, posY + 1)))) {
                    List<List<Integer>> toPut = headPositions.getOrDefault(i, new ArrayList<>());
                    toPut.add(List.of(posX, posY + 1));
                    headPositions.put(i, toPut);

                    i--;
                    rightUsed = true;
                }
            }
            if (!rightUsed && !leftUsed && !topUsed && !botUsed && i == headCounter - 1) {
                return false;
            }
            if (word.length() - 1 == letterCounter) {
                return true;
            }

        }

        return false;
    }
}