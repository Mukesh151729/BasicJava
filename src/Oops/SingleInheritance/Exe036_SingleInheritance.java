package Oops.SingleInheritance;

public class Exe036_SingleInheritance {
    public static void main(String[] args) {
         TestCase1 test1=new TestCase1();

        test1.startBrowser();
        test1.runningTest();
        test1.closeBrowser();

        TestCase2 test2 = new TestCase2();

        test2.startBrowser();
        test2.readFile();
        test2.readDatabase();
        test2.running();
        test2.closeBrowser();
    }
}
