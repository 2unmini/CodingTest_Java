import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please Write your code.
        star(1,n);
    }

    public static void star(int start,int n){
        if(start>n){
            return;
        }
        for(int i=0;i<start;i++){
            System.out.print("*");
        }
        System.out.println();
        star(++start,n);

    }
}