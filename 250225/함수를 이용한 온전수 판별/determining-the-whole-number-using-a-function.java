import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please Write your code.
        int a = sc.nextInt();
        int b = sc.nextInt();
        number(a,b);

    }
    public static void number(int a,int b) {
        int cnt = 0;
        for(int i=a;i<=b;i++) {
            if(i%2==0 || i%5==0) {
                continue;
            }
            if(i%3==0 && i%9!=0){
                continue;
            }
            cnt++;
        }
        System.out.print(cnt);

    }
}