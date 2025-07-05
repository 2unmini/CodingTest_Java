import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N =Integer.parseInt(st.nextToken()); //N개
        int M = Integer.parseInt(st.nextToken()); // 몇번 할것

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 원본 배열임
        }
        int[] sumArr = makeSumArr(arr);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[end] - sumArr[start-1]);
        }

    }


    private static int[] makeSumArr(int[] arr) {
        int[] sumArr = new int[arr.length+1];
        sumArr[0]=0;
        for (int i = 1; i <= arr.length; i++) {
            sumArr[i] = sumArr[i - 1] + arr[i-1];
        }
        return sumArr;
    }
}
