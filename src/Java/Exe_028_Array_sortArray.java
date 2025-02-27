package Java;

public class Exe_028_Array_sortArray {
    public static void main(String[] args) {

        int a[]={10,4,6,9};
        int temp;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
            System.out.println(a[i]);
        }
    }
}
