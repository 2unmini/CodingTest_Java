import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int a = Integer.parseInt(binary,2)*17;
        System.out.print(Integer.toBinaryString(a));
    }
}