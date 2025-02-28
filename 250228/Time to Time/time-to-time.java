import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int count=countTime(a,b,c,d,0);
        System.out.print(count);
    }

    public static int countTime(int a, int b, int c, int d,int count) {
        while(true) {
            if(c==a && b==d){
                break;
            }
            count++;
            b++;
            if(b==60){
                a++;
                b=0;
            }
        }
        return count;
    } 
    
}