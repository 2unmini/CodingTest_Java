import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개를 입력할것
        int k = sc.nextInt(); // 그중 몇번째를 뽑을거냐
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        checkNum(k,nums);
    }
    public static void checkNum(int k,int[] nums){
        Arrays.sort(nums);
        System.out.print(nums[k-1]);
    }
}