package BASICS_OF_JAVA;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine();
        boolean flag = check(s);
        if(flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
    public static boolean check(String str){
        int i=0;
        int n = str.length();
        while(i<=n-1){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
            i++;
        }
        return true;
    }
}
