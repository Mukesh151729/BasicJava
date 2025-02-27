package Java;

import java.util.Scanner;

public class Exe005_If_else {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age");

        int age= sc.nextInt();

        if (age>18)
        {
            System.out.println("Your are allowed to vote!!!");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }
    }
}
