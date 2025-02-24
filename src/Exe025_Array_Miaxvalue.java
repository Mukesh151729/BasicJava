public class Exe025_Array_Miaxvalue {
    public static void main(String[] args) {

        int value[]={4,6,9,10,44};

        int max=value[0];

        for (int i = 0; i <value.length ; i++) {

            if(value[i]>max)
            {
                max=value[i];
            }

        }
        System.out.println("Max value is "+max);
    }
}
