import java.util.*;
class Solution {
    public long solution(long n) {
        String nstring = String.valueOf(n);
        String[] ns = nstring.split("");
        Arrays.sort(ns,Comparator.reverseOrder());
        String answer="";
        for(String c:ns){
            answer+=c;
        }
        
        return Long.parseLong(answer);
    }
}