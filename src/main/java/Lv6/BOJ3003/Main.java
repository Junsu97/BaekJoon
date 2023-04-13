package Lv6.BOJ3003;

import java.util.Scanner;
/*
* 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
* */
public class Main {


    // 킹 퀸 룩 비숍 나이트 폰이 필요로 하는 수가 다름으로 구분하기 위한 메소드
    public static int whoAmI(int index){

        switch (index){
            case 0 : case 1 : return 1;
            case 2 : case 3 : case 4: return 2;
            case 5 : return 8;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = whoAmI(i) - arr[i];  // whoAmI 메소드를 호출하고 매개변수에 i를 넣어 순차적으로 연산
            System.out.print(arr[i]+ " ");
        }

    }
}
