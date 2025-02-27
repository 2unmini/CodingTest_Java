import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode=sc.next();
        char mPoint=sc.next().charAt(0);
        int time=sc.nextInt();
        // Please write your code here.
        Screct s = new Screct(sCode,mPoint,time);
        System.out.println("secret code : "+s.sCode);
        System.out.println("meeting point : "+s.mPoint);
        System.out.println("time : "+s.time);
    }
}
class Screct{
    String sCode;
    char mPoint;
    int time;

    Screct(String sCode,char mPoint,int time) {
        this.sCode=sCode;
        this.mPoint=mPoint;
        this.time=time;
    }
}