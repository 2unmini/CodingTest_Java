import java.util.*;
class Solution {
    public String solution(String s) {
        String[]ss = s.split("");
        String answer = "";
        Arrays.sort(ss,Collections.reverseOrder());
        for(String e:ss){
            answer+=e;
        }
        return answer;
    }
}