public class PreIncrement {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);//10
        System.out.println(a++);//10 11

        int result=a++;//11
        System.out.println(result);//11
        System.out.println(a);//12

        System.out.println(a++ +a);//25
    }
}
