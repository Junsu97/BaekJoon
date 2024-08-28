package gpt;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];

        int max = Integer.MIN_VALUE;  // 최댓값을 배열의 임의의 작은 값으로 초기화
        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        int value = 0;
        // 배열 초기화 및 최댓값 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                value++;
                arr[i][j] = value;
                max = value;
            }
        }

        // 배열 출력
        System.out.println("배열의 내용:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("최대값: " + max);
        System.out.println("위치: (" + maxRowIndex + "," + maxColumnIndex + ")");
    }
}
