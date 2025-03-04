package Oops.MultiLevel;

public class Exe037_MultilevelInheritance {

    public static void main(String[] args) {

        Son s=new Son();
        s.allProperty();
        s.BHK2();
        s.G_farmHouse();
        s.G_Home();

        Father f=new Father();
        f.BHK2();
        f.G_Home();
        f.G_farmHouse();

        GrandFather g=new GrandFather();
        g.G_farmHouse();
        g.G_Home();
    }
}
