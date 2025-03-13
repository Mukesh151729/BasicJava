package Oops.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exe044_LinkList
{
    public static void main(String[] args) {

        List list =new LinkedList();

        list.add("mukesh");
        list.add(2);
        list.add(true);

        System.out.println(list);

        Iterator iterator=list.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
