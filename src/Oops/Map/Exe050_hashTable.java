package Oops.Map;

import java.util.Enumeration;
import java.util.Hashtable;

public class Exe050_hashTable {
    public static void main(String[] args) {

        Hashtable h=new Hashtable();

        h.put("name","mukesh");
        h.put("rollno",1);
        h.put("phone",99993);

        System.out.println(h);

        Enumeration e=h.keys();
        {
            while (e.hasMoreElements())
            {
                System.out.println(e.nextElement());
            }
        }
    }
}
