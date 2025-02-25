import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please Write your code.
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        swap(max,min);
    }

    public static void swap(int a, int b){
        System.out.print(b+10+" "+a*2);
    }
}