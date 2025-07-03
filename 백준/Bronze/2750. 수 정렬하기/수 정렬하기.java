import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 몇개 줄 입력
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
