package Lv5.BOJ11654;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);
        byte asc = (byte)c;

        br.close();
        System.out.printf("%d",asc);
    }
}
