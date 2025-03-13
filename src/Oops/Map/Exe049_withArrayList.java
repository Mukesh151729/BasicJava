package Oops.Map;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exe049_withArrayList {
    public static void main(String[] args) {

        Map m=new HashMap();

        m.put("name","mukesh");
        m.put("rollno",1);
        m.put("phone",987643212);

        //System.out.println(m);

        Map m1=new HashMap();

        m1.put("name","mukesh");
        m1.put("rollno",1);
        m1.put("phone",987643212);

        List list=new ArrayList();

        list.add(m1);
        list.add(m);

        System.out.println(list);

    }
}
