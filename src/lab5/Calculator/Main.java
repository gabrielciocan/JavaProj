package lab5.Calculator;

public class Main {
    public static void main(String[] args) {


        //Define and write the values of an array indices,
        // so that the values of the arrays should start from 1 and count to 100;

//        String[] myArray = new String[1];
//        myArray[0] = "test";
//
        LogicalOp op = new LogicalOp();
//        int[] newArray = op.arrayToHundred();
//        String[] x = {"Hello","Friend"};
//        op.printArray(x);

        int[] arrayHundred = op.arrayToHundred();
        int z = 1;
        int[] p = new int[10];
        String o = new String("S");

        System.out.println(p[0]);
        p[0] = 5;
        System.out.println(p[0]);
        z = 2;




        float x = op.getAverage(arrayHundred);
        System.out.println(x);

        int[] one = {1,2,3,4,5};
        float y = op.getAverage(one);
        System.out.println(y);

    }
}
