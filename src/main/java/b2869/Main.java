package b2869;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int V = Integer.parseInt(br.readLine());
        br.close();
        int count = 0;
        while (V > 0){
            count++;
            V -= A;
            if(V <= 0){
                break;
            }
            V += B;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
