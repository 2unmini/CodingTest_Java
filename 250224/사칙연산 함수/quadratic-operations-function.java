import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please Write your code.
        int invalid = invalid(o, a, c);
        System.out.println(a+" "+ o+" "+c+" = " +invalid);
    }


    public static int invalid(char o,int a,int b) {
        switch (o) {
            case '+': {
                return a + b;
            }
            case '-': {
                return a - b;
            }
            case '/': {
                return a / b;
            }
            case '*': {
                return a * b;
            }
            default:
                return 0;
        }
    }
}