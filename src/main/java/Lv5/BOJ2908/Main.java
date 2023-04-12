package Lv5.BOJ2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");//공백 분리

        //StringBuilder이 가지고 있는 reverse 메소드를 이용하여 문자열 역전
        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
        
        //삼항연산자를 통해 값 출력
        System.out.println(A > B ? A:B);
    }
}
