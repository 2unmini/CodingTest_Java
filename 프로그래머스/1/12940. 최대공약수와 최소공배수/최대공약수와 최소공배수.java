class Solution {
    public int[] solution(int n, int m) {
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        int r=0;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        int[] answer = {a,m*n/a};
        return answer;
    }
}