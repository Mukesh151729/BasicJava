package Oops.List;

import java.util.ArrayList;
import java.util.List;

public class Exe046_Student_ArrayList {
    public static void main(String[] args) {

        Student s1=new Student("mukesh",1);
        Student s2=new Student("Mone",2);
        List list =new ArrayList();

        list.add(s1);
        list.add(s2);

        System.out.println(list);


    }
}
