import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        String[] split = input.split("");
        System.out.println(count(split));


    }

    private static int count(String[] inputArray) {
        int oneCount = 0;
        int zeroCount = 0;


        if (inputArray[0].equals("1")) {
            oneCount++;
        } else zeroCount++;

        for (int i = 0; i <= inputArray.length - 2; i++) {


            if (!inputArray[i].equals(inputArray[i + 1])) {
                if ("1".equals(inputArray[i + 1])) {
                    oneCount += 1;
                }
                if ("0".equals(inputArray[i + 1])) {
                    zeroCount += 1;
                }
            }
        }
        return Math.min(oneCount, zeroCount);
    }
}