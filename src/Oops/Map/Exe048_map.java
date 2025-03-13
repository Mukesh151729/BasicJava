package Oops.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exe048_map {
    public static void main(String[] args) {
        Map m=new HashMap();

        m.put("name","mukesh");
        m.put("rollno",1);
        m.put("phone",987643212);

        System.out.println(m);

        Map m1=new TreeMap();

        m1.put("name","mukesh");
        m1.put("rollno",1);
        m1.put("phone",987643212);

        System.out.println(m1);

        Map<String,Object> m2=new LinkedHashMap();

        m2.put("name","mukeshdhaf");
        m2.put("rollno",9);
        m2.put("phone",98764322);

        System.out.println(m2);
        System.out.println(m2.values());
        System.out.println(m2.keySet());
        System.out.println(m2.containsKey("phone"));

        for (Map.Entry<String,Object> item:m2.entrySet())
        {
            System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
