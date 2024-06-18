import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){
            st = new StringTokenizer(str," ");
           
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(A + B) + "\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}