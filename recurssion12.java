import java.util.*;
public class recurssion12 {
    public static void subSeq(String str, int idx, String newStr){
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);

        // to be added
        subSeq(str, idx + 1, newStr + curChar);

        // not to be added
        subSeq(str, idx + 1, newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subSeq(str, 0, "");
        //total no of subStrs r 2powerN(2^n)
    }
}
