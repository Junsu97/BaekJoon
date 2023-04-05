package Lv5.BOJ2743;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int x = s.length();
        br.close();

        bw.write(String.valueOf(x));
        bw.flush();
        bw.close();
    }
}
