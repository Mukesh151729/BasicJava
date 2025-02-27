package Java;

import java.util.Scanner;

public class Exe007_GradeCalculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter score");
        int num=sc.nextInt();

        if(num >=90 && num<=100)
        {
            System.out.println("A- Grade");
        } else if (num>=80 && num<89) {
            System.out.println("B-Grade");
            
        } else if (num>=70 && num<79) {
            System.out.println("C-Grade");
        } else if (num<0 || num>100) {
            System.out.println("Please enter valid number");

        } else {
            System.out.println("F-Grade");
        }
    }
}
