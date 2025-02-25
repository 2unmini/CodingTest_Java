import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please Write your code.
        String[] arr = A.split("");
        Set<String> s = new HashSet();
        for(String a:arr){
            s.add(a);
        }
        if(s.size()>1){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}