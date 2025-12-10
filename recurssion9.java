
//find first and last occurance of an element in string

import java.util.Scanner;
public class recurssion9{
    public static int fir=-1;
    public static int las=-1;
    public static void findOccr(String str,int idx,char ele){
        if(idx==str.length()){
            System.out.println(fir);
            System.out.println(las);
            return;
        }
        char curChar=str.charAt(idx);
        if(curChar==ele){
            if(fir==-1){
                fir=idx;
            }else{
                las=idx;
            }
        }
        findOccr(str, idx+1, ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char ele=sc.next().charAt(0);
        findOccr(str, 0, ele);
    }
}