import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            char firstChar = S.charAt(0);
            char lastChar = S.charAt(S.length() - 1);
            bw.write(firstChar + "" + lastChar + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}