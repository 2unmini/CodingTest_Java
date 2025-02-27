import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        filter(words,k,t);
    }
    public static void filter(String[] words,int k, String t) {
        ArrayList<String> list = new ArrayList();
        Arrays.sort(words);
        for(String word:words){
            if(word.contains(t)){
                list.add(word);
            }
        }
        System.out.print(list.get(k-1));
        

    }
}