package Java;

import java.util.Scanner;

public class Exe032_StarPattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();

        for (int i = n; i >0 ; i--) {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
