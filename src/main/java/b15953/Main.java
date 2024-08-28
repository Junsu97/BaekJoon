package b15953;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int festival1 = festival1(a) * 10000;
            int festival2 = festival2(b) * 10000;

            System.out.println(festival1 + festival2);
        }
        sc.close();
    }
    private static int festival1(int rank){
        if(rank > 21 || rank < 1) return 0;

        switch (rank){
            case 1 : return 500;
            case 2 : case 3 : return 300;
            case 4 : case 5 : case 6 : return 200;
            case 7 : case 8 : case 9 : case 10 : return 50;
            case 11 : case 12 : case 13 : case 14 : case 15  : return 30;
            default: return 10;
        }
    }
    private static int festival2(int rank){
        if(rank > 31 || rank < 1) return 0;
        switch (rank){
            case 1 : return 512;
            case 2: case 3 : return 256;
            case 4: case 5 : case 6 : case 7 : return 128;
            case 8 : case 9 : case 10 : case 11 : case 12 : case 13 : case 14 : case 15 : return 64;
            default: return 32;
        }
    }
}
