package Oops;

public class Exe033_Constructor {


    String car;
    int year;
    String model;

     Exe033_Constructor() {
          car="Unknow car";
          year=0;
          model="Unknow model";
         System.out.println("Default constructor");
    }

    public static void main(String[] args) {
            Exe033_Constructor car=new Exe033_Constructor();
            System.out.println(car.car);
            System.out.println(car.model);
            System.out.println(car.year);

            car.car="TATA";
            car.year=2025;
            car.model="SAFARI";

        System.out.println(car.car+" "+car.model+" "+car.year);
    }
}


