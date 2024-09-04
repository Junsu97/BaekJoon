package pro_lv0;

import java.util.HashMap;
import java.util.Map;

public class DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[7];
        dice[a] += 1; dice[b] += 1; dice[c] += 1; dice[d] += 1;
        if(dice[a] == 4) return a * 1111;
        for(int i = 1; i < 7; i++){
            int p;
            int q;
            p = i;
            if(dice[i] == 3){
                for(int j = 1; j < 7; j++){
                    if(dice[j] == 1){
                      q = j;
                      return (int)Math.pow((double)10 * p + q, 2);
                    }
                }
            } else if (dice[i] == 2) {
                for(int j = 1 ; j < 7; j++){
                    if(j != i && dice[j] == 2){
                        q = j;
                        return (p + q) * Math.abs(p - q);
                    } else if(dice[j] == 1){
                        q = j;
                        System.out.println("q : " + q);
                        for(int k = j+1; k < 7; k++){
                            if(dice[k] == 1){
                                return q * k;
                            }
                        }
                    }
                }
            }

        }
        return Math.min(Math.min(a,b), Math.min(c,d));
    }

    public static void main(String[] args) {
        DiceGame3 game = new DiceGame3();
        game.solution(2, 5, 2, 6);
    }
}
