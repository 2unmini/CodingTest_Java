import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int[] a= new int[s];
        for(int i=0;i<s;i++){
            a[i]=sc.nextInt();
        }

        change(a);

    }

    public static void change(int[] a) {
        
        int[] b = a.clone();
        
        for(int i=0; i<a.length;i++){
            if(a[i]%2==0){
                b[i]=a[i]/2;
            }else{
                b[i]=a[i];
            }
            System.out.print(b[i]+" ");
        }
        

    }
}