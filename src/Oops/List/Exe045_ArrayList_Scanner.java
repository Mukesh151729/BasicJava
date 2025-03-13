package Oops.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe045_ArrayList_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String> list =new ArrayList();
        String continuInput="Y";

        while (continuInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter name");
            String name=sc.nextLine();
            list.add(name);

           // sc.nextLine();
            System.out.println("Do you want to enter another record (Y/N)");
            continuInput=sc.nextLine();
        }

        for (Object o:list)
        {
            System.out.println(list);
        }
        sc.close();

    }
}
