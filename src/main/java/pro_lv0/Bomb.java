package pro_lv0;

import java.util.Arrays;

public class Bomb {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        int[][] vectors = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        int length = board.length;
        boolean[][] danger = new boolean[length][length];


        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(board[i][j] == 1){
                    for(int[] vector : vectors){
                        int nearX = i + vector[0];
                        int nearY = j + vector[1];
                        if (nearX >= 0 && nearX < length && nearY >= 0 && nearY < length) {
                            danger[nearX][nearY] = true;
                        }
                    }
                }
            }
        }
        int count = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(danger[i][j]){
                    count++;
                }
            }
        }
        return answer - count;
    }
}
