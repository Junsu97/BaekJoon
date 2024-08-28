package b1152;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int odd = 0; // 홀수
        int even = 0; // 짝수
        for(int i = 1; i <= 5; i++){
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                even += list.get(i);
            }else {
                odd += list.get(i);
            }
        }
        System.out.print("홀수의 합: " + odd + "\n짝수의 합: " + even);

    }
}
