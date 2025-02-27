package Java;

import java.util.Scanner;

public class Exe008_TraingleClassifier {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter side 1 lenght");
        double side1=sc.nextDouble();

        System.out.println("Enter side 2 lenght");
        double side2=sc.nextDouble();

        System.out.println("Enter side 3 lenght");
        double side3=sc.nextDouble();

        if (side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Please enter valid value");
        }
        else {
            if ((side1==side2) && (side2==side3)&&(side1==side3))
            {
                System.out.println("Triangle id equvilateral");
            } else if ((side1==side2) || (side2==side3)||(side1==side3)) {
                System.out.println("Triangle has two side equles");
            }
            else {
                System.out.println("Sides are not equeal");
            }
        }
        sc.close();
    }
}
