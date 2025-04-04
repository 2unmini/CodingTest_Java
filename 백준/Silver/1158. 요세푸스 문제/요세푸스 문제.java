import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        List<Integer> list = new LinkedList<>();
        int input = Integer.parseInt(stringTokenizer.nextToken());
        int cut = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 1; i <= input; i++) {
            list.add(i);
        }
        int index = cut - 1;
        System.out.print("<");
        while (!list.isEmpty()) {
            index %= list.size();
            if (list.size() != 1) {

                System.out.print(list.get(index) + ", ");

            } else {
                System.out.print(list.get(index) + ">");
            }

            list.remove(index);

            index += cut - 1;
        }

    }
}