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
        int aResult = 0;
        int bResult = 0;
        
        if(a<b) {
            aResult = a+10;
            bResult = 2*b;
        } else {
            aResult = 2*a;
            bResult = b+10;
        }
        
        return aResult + " " + bResult;
    }
}