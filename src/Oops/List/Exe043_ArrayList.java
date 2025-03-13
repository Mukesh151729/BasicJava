package Oops.List;

import java.util.ArrayList;
import java.util.List;

public class Exe043_ArrayList {
    public static void main(String[] args) {
        List list=new ArrayList();

        list.add("mukesh");
        list.add(1);
        list.add("2");

        System.out.println(list);
        System.out.println("--------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
