import java.util.*;
public class recurssion8{
    public static void strRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        strRev(str, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        strRev(str, str.length()-1);
    }
}