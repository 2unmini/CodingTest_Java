import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            int s = Integer.parseInt(bufferedReader.readLine());
            if (s > max) {
                max = s;
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}