import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        bubbleSort(arr);
        // Please write your code here.
    }

    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j =0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}