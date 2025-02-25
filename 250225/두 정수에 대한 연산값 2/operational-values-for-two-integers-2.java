import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Please Write your code.
        System.out.println(swap(a, b));
    }

    public static String swap(int a, int b){
        return a<b ? a+10 + " " + 2*b : 2*a + " " + b+10;
    }
}