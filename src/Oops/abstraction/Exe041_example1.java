package Oops.abstraction;

public class Exe041_example1 {
    public static void main(String[] args) {
        safari s=new safari();
        s.drive();
        //s.startEngine();
       // s.stopengine();
    }
}

 abstract class engine{

   abstract void startEngine();
   abstract void stopengine();
}

class safari extends engine{

    @Override
    void startEngine() {
        System.out.println("Start");
    }

    @Override
    void stopengine() {
        System.out.println("Stop");

    }

    void drive()
    {
        startEngine();
        System.out.println("I m driving");
        stopengine();
    }
}
