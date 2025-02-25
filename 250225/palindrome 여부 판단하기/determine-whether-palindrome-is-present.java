import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please Write your code.
        String output = valid(input);
        if(input.equals(output)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static String valid(String s) {
        String[] a = s.split("");
        String [] b=a.clone();
        for(int i=0;i<a.length;i++) {
            a[i] =b[a.length-i+-1];
        }
        StringBuilder st = new StringBuilder();
        for(String e: a){
            st.append(e);
        }
        return st.toString();
    }
}