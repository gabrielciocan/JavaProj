package lab5.Calculator;

public class LogicalOp {
//Write a Java program to
// calculate the average value of
// array elements.
    public int[] arrayToHundred(){
        int[] array = new int[100];
        for(int i = 1; i<=100;i++){
            array[i-1] = i;
        }
        return array;
    }
    public void printArray(String[] array){
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    public float getAverage(int[] array){
        float sum = 0;
        for(int i = 0; i< array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

}
