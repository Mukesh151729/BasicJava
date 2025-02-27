package Java;

public class Exe001 {
    public static void main(String[] args) {

        int a=10;

       System.out.println(a++ + a);  //10 11
       System.out.println(++a + a);  //12 12
       System.out.println(a++ + ++a);  //12 14
        System.out.println(++a + a++); // 11 11
        System.out.println(a);
    }
}
