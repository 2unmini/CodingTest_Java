import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int hab = sum(n);
        System.out.print(hab);
        
    }
    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;

    }
}