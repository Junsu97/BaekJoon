package pro_lv2;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"aya", "ye", "woo", "ma"};
        for(String str : babbling){
            for(String s : arr){
                str = str.replace(s,"1");
                System.out.println("str : " +  str);
            }
            str = str.replace("1", "");
            if(str.equals("")) answer++;
        }
        return answer;
    }
}
