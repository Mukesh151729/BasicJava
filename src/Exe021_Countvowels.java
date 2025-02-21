import java.util.Scanner;

public class Exe021_Countvowels {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        int temp=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='o'||str.charAt(i)=='a'||str.charAt(i)=='u'||str.charAt(i)=='i'||str.charAt(i)=='e')
            {
                 temp=temp+1;
            }
        }
        System.out.println(temp);
    }
}
