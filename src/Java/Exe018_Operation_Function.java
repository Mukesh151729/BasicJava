package Java;

import java.util.Scanner;

public class Exe018_Operation_Function {
    public static void main(String[] args) {


       Scanner sc=new Scanner(System.in);
       long a=0;
       long b=0;

        System.out.println("Enter value for a");
       if(sc.hasNextInt())
       {
            a=sc.nextLong();
       }

        else {
           System.out.println("Please enter integer value only");
           System.exit(0);
       }
        System.out.println("Enter value for b");
        if (sc.hasNextInt())
        {
            b=sc.nextLong();
        }
        else {
            System.out.println("Please enter interger value only");
            System.exit(0);
        }





        long result_sum = sum(a,b);
        long result_sub = sub(a,b);
        long result_div = div(a,b);
        long result_mul = mul(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
    }

    public static long sum(long a,long b)
    {
        return a+b;
    }

    public static long sub(long a,long b)
    {
        return a-b;
    }

    public static long mul(long a,long b)
    {
        return a*b;
    }

    public static long div(long a,long b)
    {
        if(b==0)
        {
            System.out.println("Div by zero is not allowed");
        }
        return a/b;
    }
}
