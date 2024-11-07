class Solution {
    public int solution(int num) {
        long answer = 0;
        long nums=num;
        
        while(nums!=1){
            if(nums%2==0){
                nums/=2;
                answer++;
            }else{
                nums=nums*3+1;
                answer++;
            }
        }
        return answer>=500?-1:(int)answer;
    }
}