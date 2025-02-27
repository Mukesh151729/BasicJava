package Java;

public class Exe024_Array_Minvalue {
    public static void main(String[] args) {
        int value[]={2,4,1,-6,4};

        int min=value[0];

        for (int v = 0; v <value.length ; v++) {

            if (value[v]<min)
            {
                min=value[v];
            }

        }
        System.out.println(min);
    }
}
