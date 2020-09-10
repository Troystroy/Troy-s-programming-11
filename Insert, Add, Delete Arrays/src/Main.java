public class  Main {
    static int add(int values[],int input){
        if(values.length==5) {
            values[4] = input;
        }
        return input;
    }
    static int [] before(int values[]){
        int t;
        for (t=4; t< values.length; t++){
            System.out.println("Before:\n " + values[0] + " " + values[1] + " " + values[2] + " " + values[3]);
            if (t==5);
            break;
        }
        return values;
    }
    static int[] after(int values[]){
        int j;
        for (j=6; j>values.length; j--){
            System.out.println("After:\n " + values[0] + " " + values[1] + " " + values[2] + " " + values[3] + " " + values[4]);
            if (j==5);
            break;
        }
        return values;
    }

    public static void main(String[] args) {
        int[] values = new int[5];
        int input = 5;
        values[0]=1;
        values[1]=2;
        values[2]=3;
        values[3]=4;
        values[4]=add(values,input);


       before(values);

       after(values);




        }




















    }

