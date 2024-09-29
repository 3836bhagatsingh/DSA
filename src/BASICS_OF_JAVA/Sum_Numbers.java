package BASICS_OF_JAVA;

import java.util.Scanner;
public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of numbers is " + (num1+num2));
    }
}
