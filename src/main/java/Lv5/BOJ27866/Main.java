package Lv5.BOJ27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int x = Integer.parseInt(br.readLine());

        char ch = s.charAt(x -1);
        br.close();
        bw.write(ch);
        bw.flush();
        bw.close();;
    }
}
