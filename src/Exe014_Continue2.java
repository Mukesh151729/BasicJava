public class Exe014_Continue2 {
    public static void main(String[] args) {

        for (int i=0;i<50;i++)
        {
            if (i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
