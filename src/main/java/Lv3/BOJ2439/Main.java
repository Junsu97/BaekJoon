package Lv3.BOJ2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = (N - (i+1)); j > 0; j--){
                System.out.print(" ");

            }
            for(int k = 0; k < (i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
