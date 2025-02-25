import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please Write your code.
        swap(a,b);
    }

    public static void swap(int a, int b) {
        int s = 2* (int)Math.min(a,b);
        int x = (int)Math.max(a,b)+25;
        System.out.print(s+" "+x);
    }
}