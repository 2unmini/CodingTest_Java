import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        char[] inputChar = input.toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int count = 0;
        int target = 0;

        for (char c : inputChar) {
            if (arr[c - 97] != -1) {
                target++;
                count++;
                continue;
            }
            if (c == inputChar[target++]) {
                arr[c - 97] = count;
            }
            count++;

        }

        for (int e : arr) {
            System.out.print(e + " ");
        }
        
    }
}