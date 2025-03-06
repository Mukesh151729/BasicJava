package Oops.Polymorphisum;

public class Exe038_MethodOverriding {
    public static void main(String[] args) {

        Son s =new Son();

        s.home();

        Father f1=new Father();
        f1.home();

        Father f =new Son();
        f.home();
    }
}
