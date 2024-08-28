package b2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int num = 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    ++count;
                    num = arr[i];

                }
            }
        }

        if(count == 0){
            System.out.print(max * 100);
        } else if (count == 1) {
            System.out.print(1000 + num * 100);
        } else if (count >= 2) {
            System.out.print(10000 + num * 1000);
        }
    }
}
