import java.util.*;
class Solution {
    public int solution(int[] array) {
        int max=0;
        int answer = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int a:array) {
        int count =map.getOrDefault(a,0)+1;
            if(count >max) {
                answer=a;
                max=count;
            }else if(count==max) {
                answer=-1;
            }
            map.put(a,count);
        }
        return answer;
    }
}