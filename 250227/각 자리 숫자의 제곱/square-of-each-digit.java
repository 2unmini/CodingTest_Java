import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
       System.out.print( mul(n));
    }
    public static int mul(int n) {
        if(n<=0) {
            return 0;
        }
        return mul(n/10)+(int)Math.pow(n%10,2);
    }
}