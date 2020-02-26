package lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public int readInt(){
        boolean repeat = true;
        int number = 0;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }
}
