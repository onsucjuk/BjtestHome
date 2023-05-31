import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        int j = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(s);

        int a = Integer.parseInt(br.readLine());

        String array[] = s.split(" ");

        for (int k =0; k<i; k++) {

            if(a<j) {

                st = new StringTokenizer(br.readLine());
                bw.write(Integer.parseInt(st.nextToken())+"\n");
            }

            bw.close();

        }

    }

}
