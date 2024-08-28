package b11720;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char ch;
        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            ch = (char)br.read();
            sum += Integer.parseInt(String.valueOf(ch));
        }

        br.close();
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
