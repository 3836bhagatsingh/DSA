package BASICS_OF_JAVA;

public class Understanding_Memory{
    public static void main(String[] args) {
        int num = 10; // stored in stack
        System.out.println(num);

        int[] a = {1,2,3,4,5};//  variable 'a' is stored in stack and array elements is stored in heap
        System.out.println(a[0]);

        int[] b = a; // b also point to same object as pointed by a
        System.out.println(b[0]);
    }
}