import java.util.Scanner;

public class Exe022_ReverseString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string");
        String str = sc.nextLine();
       // String reverse = "";
        String str1[] = str.split(" ");

        for (int i = 0; i < str1.length; i++) {

            for (int j = str1[i].length() - 1; j >= 0; j--) {
                System.out.print(str1[i].charAt(j));
            }
                System.out.print(" ");


        }
    }
}
