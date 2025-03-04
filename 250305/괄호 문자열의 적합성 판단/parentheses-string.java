import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        String[] arr = str.split("");
        if(check(arr)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean check(String[] arr){
        Stack<String> stack =new Stack();

        for(String s:arr){
            if(s.equals("(")){
                stack.push(s);
            }else if(s.equals(")")){
                stack.pop();            
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}