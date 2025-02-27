import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        sort(s);
    }
    public static void sort(String s){
    char[] a = s.toCharArray();
    Arrays.sort(a);
    String st = new String(a);
    System.out.println(st);
    }
}