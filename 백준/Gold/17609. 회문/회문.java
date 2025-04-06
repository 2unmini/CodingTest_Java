import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= input; i++) {
            String word = bufferedReader.readLine();

            System.out.println(palindrome(word));

        }
    }


    private static int palindrome(String word) {
        int left = 0; // 맨 왼쪽 인덱스
        int right = word.length() - 1; // 맨 오른쪽 인덱스

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {

                if (isPalindrome(word, left + 1, right) || isPalindrome(word, left, right - 1)) {
                    return 1;
                }
                return 2;
            }
            left++;
            right--;
        }

        return 0;
    }

    private static boolean isPalindrome(String word, int left, int right) {

        while (left < right) {
            if (word.charAt(right) != word.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}