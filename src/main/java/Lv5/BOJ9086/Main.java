package Lv5.BOJ9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = br.readLine();
        }
        for(int  i = 0; i < arr.length; i++){
            char c1 = arr[i].charAt(0);
            char c2 = arr[i].charAt(arr[i].length()-1);
            System.out.printf("%c%c\n",c1,c2);

        }
        br.close();

    }
}
