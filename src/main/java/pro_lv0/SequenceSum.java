package pro_lv0;

public class SequenceSum {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int centerNum = total / num; // 1
        int startValue = centerNum - (num - 1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = startValue + i;
        }

        return answer;
    }

}
