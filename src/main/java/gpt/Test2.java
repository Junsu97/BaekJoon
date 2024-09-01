package gpt;

public class Test2 {

    public static int test(int N){
        String str = String.valueOf(N);
        StringBuffer sb = new StringBuffer(str);
        int answer = Integer.parseInt(sb.reverse().toString());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(test(1234));
    }
}
