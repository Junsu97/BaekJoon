package pro_lv0;

public class OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for(String str : quiz){
            int x = Integer.parseInt(str.split(" ")[0]);
            String operation = str.split(" ")[1];
            int y = Integer.parseInt(str.split(" ")[2]);
            int z = Integer.parseInt(str.split(" ")[4]);

            if(operation.equals("+")){
                answer[index] = x + y == z ? "O" : "X";
            }else{
                answer[index] = x - y == z ? "O" : "X";
            }
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        OXQuiz quiz = new OXQuiz();
        String[] arr = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        quiz.solution(arr);
    }
}
