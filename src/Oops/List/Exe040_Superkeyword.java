package Oops.List;

public class Exe040_Superkeyword {
    public static void main(String[] args) {

        son s1=new son(1);
        s1.sonhome();
    }

}

class father{
    int gold=10;

    public father(int gold) {
        this.gold = gold;
    }

    void home()
    {
        System.out.println("Father home");
    }
}

class son extends father{

    public son(int gold) {
        super(gold);
    }

    void sonhome()
    {
        home();
        System.out.println("Son home");
    }
}
