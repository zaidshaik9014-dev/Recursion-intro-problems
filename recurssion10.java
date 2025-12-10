import java.util.*;
public class recurssion10{
    public static boolean isSorted(int a[],int idx){
        if(idx==a.length-1){
            return true;
        }
        if(a[idx]<a[idx+1]){
            return isSorted(a, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(isSorted(a, 0));
    }
}