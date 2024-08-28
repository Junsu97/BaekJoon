package b10818;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int min;
        int max;
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int i = 0; i < N; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
