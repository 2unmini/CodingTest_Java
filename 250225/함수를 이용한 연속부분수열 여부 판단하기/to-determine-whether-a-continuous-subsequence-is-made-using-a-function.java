import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        for(int i=0;i<n1;i++) {
            arr1[i]= sc.nextInt();
        }

        for(int i=0;i<n2;i++) {
            arr2[i]= sc.nextInt();
        }

        if(check(arr1,arr2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");

        }
        
    }
    public static boolean check(int[] arr1,int[] arr2) {
        int idx = Arrays.asList(arr1).indexOf(arr2[0]);
        for (int i = 1; i < arr2.length-2; i++) {
            if (arr1[idx++] != arr2[i]) {
                return false;
            }
            
        }
        return true;
    }
}