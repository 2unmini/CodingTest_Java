import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortAsc(arr);
        System.out.println();
        sortDesc(arr);
        
       // Please write your code here.
    }
    public static void sortAsc(int[] n) {
        Arrays.sort(n);
        for(int a:n){
            System.out.print(a+ " ");
        }
    }

    public static void sortDesc(int[] n) {
        Integer[] a=Arrays.stream(n).boxed().toArray(Integer[]::new);
        Arrays.sort(a,Collections.reverseOrder());
        for(Integer i:a){
            System.out.print(i+ " ");
        }
    }
}