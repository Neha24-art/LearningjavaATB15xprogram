package String;
import java.util.Scanner;

public class string_reverse {
    static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("enter the string:");
        String str= scr.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+ str.charAt(i);

        }
        System.out.println(rev)   ;
        scr.close();
    }
}
