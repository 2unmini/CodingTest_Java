class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String numbers[]=phone_number.split("");
        for(int i=0;i<numbers.length-4;i++){
            answer+="*";
        }
        for(int i=numbers.length-4;i<numbers.length;i++) {
            answer+=numbers[i];
        }
        return answer;
    }
}