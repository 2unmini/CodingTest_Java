class Solution {
    public int solution(int angle) {
        if(angle==180){
            return 4;
        }else if(angle<180 && angle>90){
            return 3;
        }else if(angle==90){
            return 2;
        }else
            return 1;
        
    }
}