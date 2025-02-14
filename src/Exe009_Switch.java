import java.util.Scanner;

public class Exe009_Switch {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");
        int day=sc.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;

            case 4:
                System.out.println("Thru");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Satu");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid number");
                break;
        }
    }
}
