package Lv3.BOJ10952;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        while (true){
            a = in.nextInt();
            b = in.nextInt();
            if(a + b == 0){break;}
            System.out.println(a+b);
        }
    }
}
