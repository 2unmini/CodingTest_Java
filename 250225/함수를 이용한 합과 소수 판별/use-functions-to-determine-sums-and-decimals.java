import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please Write your code.
        prime(a,b);


    }
    public static void prime(int a, int b) {
        int cnt =0;
        int answer=0;
        for(int i=a;i<=b;i++) {
            if (isPrime(i) && isOdd(i)) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; 

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static boolean isOdd(int j) {
        int answer=0;
        String s =Integer.toString(j);
        char[] c= s.toCharArray();
        for(int i=0;i<c.length;i++) {
            answer+=Integer.parseInt(String.valueOf(c[i]));
        }

        if(answer%2==0){
            return true;
        }

        return false;
    }
}