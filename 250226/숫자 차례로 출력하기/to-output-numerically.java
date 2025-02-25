import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please Write your code.
        print1(1,n);
        System.out.println();
        print2(n);
    }


    public static void print1(int start, int n) {
        
        if(start>n){
            return;
        }
        System.out.print(start + " ");
        print1(++start,n);
    }
    public static void print2(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print2(n-1);
    }
}