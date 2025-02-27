import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        Struct s1 = new Struct();
        Struct s2 = new Struct(id,level);
        System.out.println("user "+s1.id +" lv "+s1.level);
        System.out.println("user "+s2.id +" lv "+s2.level);
    }
}
class Struct{
    String id;
    int level;
    Struct(){
        this.id="codetree";
        this.level=10;
    }
    Struct(String id,int level){
        this.id =id;
        this.level=level;
    }
}