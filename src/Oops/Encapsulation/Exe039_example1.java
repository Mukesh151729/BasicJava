package Oops.Encapsulation;

public class Exe039_example1 {
    public static void main(String[] args) {
        ICICI icici=new ICICI("mukesh",100000);

        System.out.println(icici.getName());
        System.out.println(icici.getBalance());

        boolean isCashier=true;
        icici.setBalance(500000,true);
        System.out.println(icici.getBalance());

        icici.setName("Mukesh Dhage");
        System.out.println(icici.getName()+" "+icici.getBalance());

    }
}


class ICICI{
    private String name;
    private long balance;

    public ICICI(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if(isCashier){
        this.balance = balance;}

        else
        {
            System.out.println("Your are not allowed");
        }
    }
}