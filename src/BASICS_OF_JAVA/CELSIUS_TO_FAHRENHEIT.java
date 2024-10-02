package BASICS_OF_JAVA;

import  java.util.Scanner;
public class CELSIUS_TO_FAHRENHEIT {
    public static double temp_conversion(double c){
        double f = c*9/5+ 32;
        return f;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double temp = sc.nextDouble();
        System.out.println(temp_conversion(temp));
    }
}
