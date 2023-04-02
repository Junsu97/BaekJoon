package Lv3.BOJ2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = "*";
        for(int i = 0; i < N; i++){    // 줄을 몇개 만들 것인가
            for(int j = (N - (i+1)); j > 0; j--){ // 공백을 몇개 찍을 것인가.
                System.out.print(" ");
            }
            System.out.println(s);
            s+="*";
        }
    }
}

