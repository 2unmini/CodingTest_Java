import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please Write your code.

        print(n,n);
    }
    public static void print(int point, int n) {
        if(point==0){
            point=n;
            return;
        }
        for(int i=n;i>0;i--){
            System.out.print(point--+" ");
        }
        print(point,0);
        for(int i=0;i<n;i++){
            System.out.print(++point +" ");
        }


    }
}