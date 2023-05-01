package Lv6.BOJ1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            if(check() == true){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }

    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            int now = str.charAt(i); // 아스키 코드 저장

            // 앞선 문자와 i 번째 문자가 같지 않다면?
            if(prev != now){

                //해당 문자가 처음 나오는 경우 (false 인 경우)
                if(check[now - 'a'] == false){
                    check[now - 'a'] = true;
                    prev = now;  //다음턴을 위해 prev 도 바꿈
                }

                // 해당 문자가 이미 나온 적이 있는 경우(그룹단어가 아니게 됨)
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
