package Java;

import java.util.Scanner;

public class Exe010_SwitchStatement1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter broeser name");
        String browser=sc.next();

        switch (browser){

            case "chrome":
                System.out.println("Chrome browser is running");
                break;

            case "Firefox":
                System.out.println("Firefox browser is runnuing");
                break;
            case "edge":
                System.out.println("Edge browser is running");
                break;


            default:
                System.out.println("Enter valid browser");
                break;
        }
    }
}
