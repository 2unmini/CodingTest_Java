import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        find(nums);
        // Please write your code here.
    }

    public static void find(int[] nums){
        Arrays.sort(nums);
        int max= 0;
        int left =0;
        int right = nums.length-1;
        while(left!=right+1) {
            int a =nums[left++]+nums[right--];
            if(a>max){
                max=a;
            }
        }
        System.out.print(max);
    }
}