package Java;

public class Exe004 {
    public static void main(String[] args) {
        int a=109;
        int b=11;
        int c=-12;

        int max_number= (a>=b)?((a>=c)?a:c):((b>=c)?b:c);
        System.out.println(max_number);
    }
}
