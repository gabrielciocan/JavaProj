package lab4.calculator;

public class LogicalOp {

    public int verifyGreaterNumber(int first, int second) {
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
    public String printNumber(int number) {
        if (number > 3 && number != 4) {
            return ("The number is greater than 3 and not equal to 4.");
        } else if (number == 4) {
            return ("The number is equal to 4.");
        } else if (number < 3) {
            return ("The number is lower than 3");
        } else {
            return ("The number did not meet any expectations.");
        }
    }
    //Afisati doar numerele pare de la 0 la -100;

    //Using For Loops Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
    // Also compute and display the average.
    public void printToHundred(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count ++;
            sum = sum + i;
//            System.out.println("Numarul este: " + i);
        }
        System.out.println("Media este: " + sum/count);
    }
    public void printFromHundred(int first, int second){
        for(int i = first;i>=second;i--){
            System.out.print(i+", ");
        }
    }
    public float getAverage(int first, int second){
        float sum = 0;
        float average = 0;
        int counter = 0;
        while(first<=second){
            sum += first;
            first++;
            counter++;
        }
        average = sum/counter;
        return average;
    }
}
