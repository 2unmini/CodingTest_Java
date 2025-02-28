import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        countDay(m1,d1,m2,d2,1);
    }
    public static void countDay(int m1,int d1,int m2,int d2,int count) {
        int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        while(true){
            if(m2==m1 && d2==d1){
                break;
            }
            count++;
            d1++;
            if(months[m1-1]<d1) {
                m1++;
                d1=1;
            }
        }
        System.out.print(count);
    }
}