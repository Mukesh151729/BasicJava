package Oops.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exe047_set {
    public static void main(String[] args) {

        Set s=new HashSet();

        s.add("mukesh");
        s.add(1);
        s.add("dhage");

        System.out.println(s);

        Set s1=new LinkedHashSet();
        s1.add("mukesh");
        s1.add("dhage");
        s1.add("mone");

        System.out.println(s1);

        Set s2=new TreeSet();

        s2.add("mukesh");
        s2.add("dhage");
        s2.add("mone");

        System.out.println(s2);
    }
}
