import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // Please write your code here.
        
        print(n,k);
    }
    public static void print(int n,int k) {
        Queue<Integer> queue = new LinkedList();
        for(int i=1;i<=n;i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i=0;i<k-1;i++) {
                queue.add(queue.poll());
            }
            int rove=queue.poll();
            System.out.print(rove+" ");
        }
        
    }
}