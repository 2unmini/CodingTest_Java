class Solution {
    public long[] solution(int x, int n) {
        long sol = x;
        long[] answer = new long[n];
        for(int i=0;i<answer.length;i++){
            answer[i]=sol;
            sol+=x;
        }
        return answer;
    }
}