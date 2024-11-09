import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size=0;
        int i=0;
        for(int e:arr) {
            if(e%divisor==0) {
                size++;
            }
        }
        if(size==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int [size];
        
        for(int e:arr) {
            if(e%divisor==0) {
                answer[i++] =e;
            }
        }
        
         Arrays.sort(answer);
        return answer;
    }
}