import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int c:arr){
            if(c<0){
                System.out.print(-1*c+ " ");
            }else{
                System.out.print(c+ " ");
            }
        }
        // Please Write your code.
    }
}