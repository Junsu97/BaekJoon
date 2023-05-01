package Lv6.BOJ3003;

import java.util.Scanner;

public class Minkyu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = {1,1,2,2,2,8}; // 몇개 필요한가
        int [] arr2 = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
           arr[i] = arr[i]-arr2[i];
            System.out.println(arr[i]);
        }

    }
}

