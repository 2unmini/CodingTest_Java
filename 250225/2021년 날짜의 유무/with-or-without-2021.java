import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please Write your code.
        if(invalid(m,d)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean invalid(int m,int d){
        switch(m){
            case 1: case 3:case 5: case 7:case 8: case 10: case 12 : {
                return d >= 1 && d <= 31;
            }
            case 4 :case 6 : case 9 :case 11:{
                 return d >= 1 && d <= 30;
            }
            case 2:{
                return d >= 1 && d <= 28;
            }
            default:
                return false;

        }
    }
}