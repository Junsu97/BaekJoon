package algorithm;

public class DigitsPlus {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
            System.out.println("answer: " + answer);
            System.out.println("n: " + n);
        }
        return answer;
    }
    public static void main(String[] args) {
        DigitsPlus solution = new DigitsPlus();
        System.out.println(solution.solution(123456789));
    }
}
