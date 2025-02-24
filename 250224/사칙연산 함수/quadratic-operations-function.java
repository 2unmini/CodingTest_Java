import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        // Please Write your code.
        System.out.println(cal(a, o, c));

    }


    public static String cal(int a, char o, int c) {
        StringBuilder result = new StringBuilder();

        result.append(a).append(" ").append(o).append(" ").append(c);

        switch (o) {
            case '+': {
                return result.append(" = ").append(a + c).toString();
            }
            case '-': {
                return result.append(" = ").append(a - c).toString();
            }
            case '*': {
                return result.append(" = ").append(a * c).toString();
            }
            case '/': {
                return result.append(" = ").append(a / c).toString();
            }
            default:
                return "False";
        }
    }
}