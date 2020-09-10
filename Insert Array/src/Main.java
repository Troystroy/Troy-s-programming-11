import java.util.Arrays;

public class Main {


    static int[] insert(int[] values2, int insert, int[] values, int pos){
        for (int t = values.length-1; t > pos; t--){
            values2[t] = values2[t-1];
            values2[pos] = insert;

        }
        return values2;
    }

    public static void main(String[] args) {
        int[] values = {1,2,3,4};
        int[] values2 = new int[5];
        values2[0] = 1;
        values2[1] = 2;
        values2[2] = 3;
        values2[4] = 4;
        int pos = 2;
        int length = values.length;
        int insert = 20;


        System.out.println("Before: \n" + Arrays.toString(values));
        insert(values2, insert, values, pos);
        System.out.println(Arrays.toString(values2));








    }
}
