package Oops.Interface;

public class Exe042_example1 {
    public static void main(String[] args) {
        drive d =new drive();
        d.cardrive();
    }
}

class drive implements engine,breaks
{
    void cardrive()
    {
        startengine();
        breaks();
        stopengine();
    }
    @Override
    public void breaks() {
        System.out.println("apply break");
    }

    @Override
    public void startengine() {
        System.out.println("start");

    }

    @Override
    public void stopengine() {
        System.out.println("stop");

    }
}
interface  engine
{
    void startengine();
    void stopengine();
}

interface breaks{
    void breaks();
}