class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer={-1};
            return answer;
        }
        int min =arr[0];
        for(int e:arr) {
            if(min>e){
                min=e;
            }
        }
        int indx=0;
        int[] answer = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                continue;
            }
            answer[indx++]=arr[i];
        }
        return answer;
    }
}