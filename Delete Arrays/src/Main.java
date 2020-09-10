public class Main {

    static int[] before(int [] values){
        for (int t : values){
            System.out.print(t + "\t");
        }
        return values;
    }

    static int[] delete(int[] values){
        int[] after = new int[4];
        after[0] = 1;
        after[1] = 2;
        after[2] = 3;
        after[3] = 4;

        for(int t : after){
            System.out.print(t + "\t");

        }
        return values;
    }





    public static void main(String[] args) {

        int[] values = new int[5];
        values[0] = 1;
        values[1] = 2;
        values[2] = 3;
        values[3] = 4;
        values[4] = 5;





        System.out.println("Before: ");
        before(values);




        System.out.println("\n" +"After: ");
        delete(values);




    }
}
