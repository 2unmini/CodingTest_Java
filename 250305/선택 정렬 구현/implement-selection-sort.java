import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp =arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}