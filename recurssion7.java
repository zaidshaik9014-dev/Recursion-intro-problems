import java.util.*;
public class recurssion7{
    public static void towerOfHanoi(int n,String src,String hel,String des){
        if(n==1){
            System.out.println("Transfer disk "+ n +" from "+ src +" to "+des);
            return;
        }
        towerOfHanoi(n-1, src,des, hel);
        System.out.println("Transfer disk "+ n +" from "+src+" to "+des);
        towerOfHanoi(n-1, hel, src, des);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
    }
}
