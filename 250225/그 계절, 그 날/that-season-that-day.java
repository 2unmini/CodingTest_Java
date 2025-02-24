import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please Write your code.
        invalid(y,m,d);

    }

    public static void invalid(int y, int m,int d){

        if(invalidD(m,d,invalidY(y))){
            System.out.print(invalidM(m));
        }else{
            System.out.print(-1);
        }
    }

    public static boolean invalidY(int y) {
        // 4의 배수 o
        // 4의 배수이면서 100배수면 윤년 x
        // 4의 배수 이면서 100 배수 지만 400배수라면 윤년 o

        if(y%4==0 && y%100==0 && y%400==0){
            return true;
        }

        if(y%4==0&& y%100==0){
            return false;
        }

        if(y%4==0){
            return true;
        }
        return false;


    }

    public static String invalidM(int m) {
        switch(m) {
            case 1: case 2: case 12: {
                return "Winter";
            }
            case 3: case 4: case 5: {
                return "Spring";
            }
            case 6: case 7: case 8: {
                return "Summer";
            }
            case 9: case 10: case 11: {
                return "Fall";
            }
        }
        return"-1";
        
    }
    
    public static boolean invalidD(int m ,int d,boolean f) {

         switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return d >= 1 && d <= 31;
            case 4: case 6: case 9: case 11:
                return d >= 1 && d <= 30;
            case 2:
                return d >= 1 && d <= (f ? 29 : 28);
            default:
                return false;
        }
        
    }
}