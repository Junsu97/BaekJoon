package lv8.boj2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); // 테스트 횟수
        int quarter = 25;  //쿼터 0.25$
        int dime = 10;  //다임 0.10$
        int nickel = 5;  //니켈 0.05$
        int penny = 1;  //페니 0.01$

        StringBuilder sb = new StringBuilder();

        /**
         * append : 문자추가 메서드
         * StringBuilder 변수 제일 뒤에 원하는 문자열을 자유롭게 추가할 수 있도록 해준다
         * */
        for(int i = 0; i < testCase; i++){
            int c = Integer.parseInt(br.readLine());
            sb.append(c / quarter + " ");
            c %= quarter;
            sb.append(c / dime + " ");
            c %= dime;
            sb.append(c / nickel + " ");
            c %= nickel;
            sb.append(c / penny + "\n");
        }
        System.out.print(sb);
    }
}
