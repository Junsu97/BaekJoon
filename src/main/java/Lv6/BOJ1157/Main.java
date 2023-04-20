package Lv6.BOJ1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // toUpperCase()  대상 문자열을 모두 대문자로 변환
        String str = in.next().toUpperCase();

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for(int i = 0; i < count.length; i++){
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            }else if(max == count[i]){
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
