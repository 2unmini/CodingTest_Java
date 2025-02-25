import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please Write your code.
        int[] c = swap(a,b);
        System.out.print(c[0]+" "+c[1] ); 
    }

    public static int[] swap(int a, int b) {
        int s = 2 * Math.min(a,b);
        int x = Math.max(a,b)+25;
        int [] c =new int [2];
        c[0]=s;
        c[1]=x;
        return c;
    }
}