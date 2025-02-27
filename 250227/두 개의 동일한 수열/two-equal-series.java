import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        a=sorting(a);
        b=sorting(b);
        if(Arrays.equals(a,b)){
            System.out.print("Yes");
            return;
        }
        System.out.print("No");
    }

    public static int[] sorting(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}