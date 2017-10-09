import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,p;
        String str1,str2;
        Scanner scan = new Scanner(System.in);
        p = scan.nextInt();
        scan.nextLine();
        str1 = scan.nextLine();
        str2 = scan.nextLine();
       char[] stchar1 = str1.toCharArray();
        char[] stchar2 = str2.toCharArray();
        for(i=0; i < str1.length(); i++){
            if(i%2==0){
                System.out.print(stchar1[i]);
            }
        }
        for(i=0; i< p-1; i++){
        System.out.print(" ");
        }
        for(i=0; i < str1.length(); i++){
            if(i%2!=0){
                System.out.print(stchar1[i]);
            }
        }
        System.out.println();
        for(i=0; i < str2.length(); i++){
            if(i%2==0){
                System.out.print(stchar2[i]);
            }
        }
        for(i=0; i< p-1; i++){
        System.out.print(" ");
        }
        for(i=0; i < str2.length(); i++){
            if(i%2!=0){
                System.out.print(stchar2[i]);
            }
        }
    }
}