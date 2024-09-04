package pro_lv0;

import java.util.Arrays;
import java.util.Comparator;

public class Snail{
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int k = 1;
        int snail = answer.length;
        int right = -1;
        int bottom = 0;
        int top = 1;
        for(int i = snail; i > 0; i++){
            for(int j = 0; j < snail; j++){
                right += top;
                answer[bottom][right] = k;
                k++;
            }
            snail--;
            for(int j = 0; j < snail; j++){
                bottom += top;
                answer[bottom][right] = k;
                k++;
            }
            top = -top;
        }
        return answer;
    }
}

