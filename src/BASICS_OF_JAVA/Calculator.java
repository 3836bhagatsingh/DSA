package BASICS_OF_JAVA;

import java.util.Scanner;

public class Calculator {
    public static int calc(int a,int b,char ch){
        if(ch=='+') return a+b;
        else if(ch=='-') return a-b;
        else if(ch=='*') return a*b;
        else if(ch=='/') return a/b;
        else if(ch=='%') return a%b;
        else{
            System.out.println("Invalid operator");
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int  a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char ch = sc.next().trim().charAt(0);
        System.out.println(calc(a,b,ch));

    }
}
