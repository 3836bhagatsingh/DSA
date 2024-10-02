package BASICS_OF_JAVA;

import java.util.Scanner;

public class Simple_Intrest {
    public  static double SI(double p,double r,int t){
        return p*r*t /100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal:");
        double p = sc.nextDouble();
        System.out.print("enter Rate:");
        double r = sc.nextDouble();
        System.out.print("Enter Time:");
        int t = sc.nextInt();
        System.out.println(SI(p,r,t));
        }
}
