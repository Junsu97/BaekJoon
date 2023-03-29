package Lv4.BOJ10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int min;
        int max;
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        min = arr[0];
        max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
