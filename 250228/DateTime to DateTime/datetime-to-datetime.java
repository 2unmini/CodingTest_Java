import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        if(A < 11 || (A == 11 && B < 11) || (A == 11 && B == 11 && C < 11)){
            System.out.print(-1);
            return;
        }       
        int cnt = (A-11)*1440+(B-11)*60+(C-11);
        System.out.print(cnt);
    }
}