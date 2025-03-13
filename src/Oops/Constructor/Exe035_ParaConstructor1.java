package Oops.Constructor;

public class Exe035_ParaConstructor1 {
    public static void main(String[] args) {

        mobile iphone=new mobile("iphone","2008");
        mobile oppo =new mobile("oppo","2020");

        System.out.println(iphone.mobile_name+" "+ iphone.year);
        System.out.println(oppo.mobile_name+" "+ oppo.year);

        iphone.display();

        String modelName=oppo.printModelName();
        System.out.println(modelName);

    }



}

class mobile{
    String mobile_name;
    String year;

    public mobile(String mobile_name_c, String year_c) {
        this.mobile_name = mobile_name_c;
        this.year = year_c;
    }

    void display()
    {
        System.out.println(mobile_name+" "+year);
    }

    String printModelName()
    {
        return mobile_name;
    }

}