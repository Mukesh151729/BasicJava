import java.util.Scanner;

public class Exe006_OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter nuber to check");
        int number=sc.nextInt();

        if(number%2==0)
        {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
