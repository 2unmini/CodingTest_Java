import java.util.*;
import java.util.stream.Stream;

public class Solution {
    public int solution(int n) {
        int answer=0;
        int[] ns = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int e :ns){
            answer+=e;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}