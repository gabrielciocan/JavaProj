package lab4.calculator;

public class Main {



    public static void main(String[] args) {

        //1.Given two numbers,
        // see which one is the
        // greatest and print it
        int x = 3;
        int y = 8;

        LogicalOp op = new LogicalOp();
//        System.out.println(op.verifyGreaterNumber(x,y));

//      2.Given a text input,
//      if it is “FastTrack”,
//      then print “Learning text comparison”.
//      If not, print “Got to try some more”

//        String text = "FastTrack";
//        String text2 = "Teasdast";
////        String text2 = new String("FastTrackIt");
//        String result = op.verifyText(text,text2);
//        System.out.println(result);


//        String number = "200";

//        op.printNumber(number);

        //>3&&!=4; ==4; <3

//        String text = "FastTrackIt";

        int number = 5;

//        System.out.println(op.printNumber(number));


    //Given a number, while the number is equal to or lower than 100, print the number;
        //    //Write a java program to count backwards from a given number to a lower given number
//

//        op.printToHundred(20);
//        op.printFromHundred(10,2);


        //Modify the program to sum from 111 to 8899, and compute the average.
        // Introduce an int variable called count to count the numbers in the specified range.
        int counter = 0;
        label:
            for(int i = 1; i < 5; i++){
                label2:
                    for(int j = 5; j > 0;j--){
                        if(counter == 3){
                            break label;
                        }
                        System.out.println(j);
                    }
                    counter ++;
            }
    }

}
