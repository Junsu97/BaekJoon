package Lv4.BOJ3052;


import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> hs = new HashSet<>();
        int tmp;

        for(int i = 0; i < 10; i++){
            tmp = Integer.parseInt(br.readLine());
            hs.add(tmp % 42);
        }

        bw.write(String.valueOf(hs.size()));
        br.close();
        bw.flush();
        bw.close();

    }
}
