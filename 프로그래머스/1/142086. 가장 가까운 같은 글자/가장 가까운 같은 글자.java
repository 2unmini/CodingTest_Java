class Solution {
    public int[] solution(String s) {
        
        String[] arr = s.split("");
        
        int[] answer = new int[s.length()];
        answer[0]=-1;
        for(int i = 1; i<arr.length;i++) {
            for(int j=i-1;j>=0;j--) {
                if(arr[i].equals(arr[j])) {
                    answer[i]=i-j;
                    break;
                }
            }
            if(answer[i]==0){
                answer[i]=-1;
            }
        }
        return answer;
        
        
    }
}