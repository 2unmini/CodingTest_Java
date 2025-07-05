

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());//N개 입력
        int sum = 0;
        int max = 0;
        double avg = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(max<num){
                max = num;
            }
            list.add(num);
        }

        for (Integer num : list) {
            avg += (double)num/max*100/N;
        }

        System.out.println(avg);

    }
}
