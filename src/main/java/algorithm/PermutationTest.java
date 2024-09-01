package algorithm;

import java.util.HashSet;
import java.util.Set;

public class PermutationTest {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int size = arr.length;
        boolean[] seen = new boolean[size + 1]; // 각 숫자가 등장했는지 추적하는 배열 (1부터 size까지)

        for(int i : arr){
            if(i < 1 || i > size){
                answer = false;
                return answer;
            }
            if(seen[i]){
                answer = false;
            }
            seen[i] = true;
        }
        return answer;
    }
}
