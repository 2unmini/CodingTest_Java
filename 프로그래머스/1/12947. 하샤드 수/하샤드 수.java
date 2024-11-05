class Solution {
    public boolean solution(int x) {
        String sx = String.valueOf(x);
        int sum=0;
        char[] cx =  sx.toCharArray();
        for(char c :cx){
            sum+=Character.getNumericValue(c);
        }
        
        return x%sum==0?true:false;
    }
}