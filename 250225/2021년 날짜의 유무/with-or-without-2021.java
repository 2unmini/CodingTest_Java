import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please Write your code.
        invalid(m,d);
    }

    public static void invalid(int m,int d){
        switch(m){
            case 1: case 3:case 5: case 7:case 8: case 10: case 12 : {
                if(d>31){
                    System.out.println("No");
                    break;
                }
            }
            case 4 :case 6 : case 9 :case 11:{
                if(d>30){
                    System.out.println("No");
                    break;
                }
            }
            case 2:{
                if(d>28){
                    System.out.println("No");
                    break;
                }
            }
            default:
            System.out.println("Yes");


        }
    }
}