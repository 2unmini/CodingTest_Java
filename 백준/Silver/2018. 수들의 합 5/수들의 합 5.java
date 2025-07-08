
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

        int start = 1;
        int end = 1;
        int sum=1;
        int count=0;

        while (start <= N){

            if(sum==N){
            count++;
            }
            if(sum>=N){
                sum-=start++;
            }else {
                end++;
                sum+=end;
            }
        }
        System.out.println(count);
    }
}
