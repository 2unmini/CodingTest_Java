import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        same(word1,word2);
    }
    public static void same(String word1,String word2){
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }
}