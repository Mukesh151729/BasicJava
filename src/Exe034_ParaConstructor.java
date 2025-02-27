public class Exe034_ParaConstructor {

    String model_name;
    int yearl;

    public Exe034_ParaConstructor(String model,int year) {

        this.model_name=model;
        this.yearl=year;
    }

    public static void main(String[] args) {

        Exe034_ParaConstructor car=new Exe034_ParaConstructor("TATA",2025);
        System.out.println(car.model_name+" "+car.yearl);

        Exe034_ParaConstructor car2 = new Exe034_ParaConstructor("Mahindra",2024);
        System.out.println(car2.model_name+" "+car2.yearl);
    }
}
