package todayRecommended;

import java.util.ArrayList;
import java.util.List;

public class ArrayQuiz {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int X = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < flag.length; i++){
            X = arr[i];
            if(flag[i]){
                for(int j = 0; j < X * 2; j++){
                    list.add(X);
                }
            }else{
                int removeCount = Math.min(X, list.size());
                for(int j = 0; j < removeCount; j++) {
                    list.remove(list.size() - 1); // 리스트의 마지막 요소 제거
                }
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        ArrayQuiz quiz = new ArrayQuiz();
        System.out.println(quiz.solution(arr, flag).toString());
    }
}
