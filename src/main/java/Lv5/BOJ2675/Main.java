package Lv5.BOJ2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String[] arr = br.readLine().split(" ");// 공백 분리
            /*
            * 공백을 기준으로 분리한 문자열 배열이므로 3 ABC 일 경우
            * arr[0] = 3
            * arr[1] = ABC
            * */
            int R = Integer.parseInt(arr[0]);
            String S = arr[1];
            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
