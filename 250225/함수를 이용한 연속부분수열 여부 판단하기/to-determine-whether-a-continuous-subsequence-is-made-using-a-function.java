import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ArrayList<Integer> list1 =new ArrayList();
        ArrayList<Integer> list2 =new ArrayList();

        for(int i=0;i<n1;i++) {
            list1.add(sc.nextInt());
        }

        for(int i=0;i<n2;i++) {
            list2.add(sc.nextInt());
        }

        if(check(list1,list2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");

        }

    }
    public static boolean check(ArrayList arr1,ArrayList arr2) {
       int idx =arr1.indexOf(arr2.get(0));
       if(idx==-1){
        return false;
       }
        for (int i = 1; i <= arr2.size()-1; i++) {
            if (arr1.subList(i, i + arr2.size()).equals(arr2)) {
                return true;
            }

        }
        return false;
    }
}