class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int indx=0;
        for(int i =0;i<seoul.length;i++) {
            if(seoul[i].equals("Kim")){
                indx=i;
            }
        }
        String ix =String.valueOf(indx);
        sb.append("김서방은 ")
            .append(ix)
            .append("에 있다");
        return sb.toString();
    }
}