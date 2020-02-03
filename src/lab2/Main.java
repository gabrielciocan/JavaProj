package lab2;

public class Main {
    static int memberVariable = 3;

    public static void main(String[] args) {
        int localVariable = 5;

        int x = sum(15, 89);
        System.out.println(x);

        printName("Cosmin");

    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static void printName(String name) {
        System.out.println("The name is:");
        System.out.println(name);
    }

}

