
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());//N개 입력
        String num = br.readLine();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += num.charAt(i) - '0'; 
        }
        System.out.println(sum);

    }
}
