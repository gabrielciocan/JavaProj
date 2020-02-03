package lab3.calculator;

public class LogicalOp {

    public static int verifyGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText(String text, String text2) {
        if (text.equals("FastTrack") && text2.equals("Test")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }
//  3. Given a number, if it’s equal to or higher than 2
//  and equal to or lower than 8, print the number
// 4. Given a text input and a number input,
// if the text is equal to “FastTrack” AND the number is equal
// to or lower than 3,
// print the text and the number.
// If the text is not “FastTrack” AND the number is equal to or
// higher than 4,
// print the number and the text, in this order.


//    public void printNumber(String number){
//        switch (number){
//            case "100":
//                System.out.println("Valoare este 100!");
//                break;
//            case "200":
//                System.out.println("Valoare este 200!");
//                break;
//            default:
//                System.out.println("Valoare este 0.");
//        }
//    }
    public String printNumber(int number){
        if(number > 3 && number != 4){
            return("The number is greater than 3 and not equal to 4.");
        }else if(number == 4){
            return ("The number is equal to 4.");
        }else if(number < 3){
            return ("The number is lower than 3");
        }
        else{
            return ("The number did not meet any expectations.");
        }
    }
}
