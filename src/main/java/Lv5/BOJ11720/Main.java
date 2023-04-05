package Lv5.BOJ11720;


import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char ch;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            ch = (char)br.read();
            arr[i] = Integer.parseInt(String.valueOf(ch));
        }
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
