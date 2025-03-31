import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack();
        for(int e :arr) {
            if(stack.isEmpty()||!stack.peek().equals(e)) {
                stack.push(e);
            }
        }
        int[] answer = new int [stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i]=stack.get(i);
}

        return answer;
    }
    
}