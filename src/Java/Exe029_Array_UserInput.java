package Java;

import java.util.Scanner;

public class Exe029_Array_UserInput {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        int a[]=new int[size];

        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter element of array");
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
