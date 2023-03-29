package Lv4.BOJ10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int[] arr = new int[N];
        int[] arr_2 = new int[N];
        for(int i = 0; i < N; i++){
            int b = in.nextInt();
            arr[i] = b;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < a){
                arr_2[i] = arr[i];
                System.out.println(arr_2[i]);
            }
        }

    }
}
