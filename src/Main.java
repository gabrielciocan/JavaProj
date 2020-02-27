import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(1);
        list.add(2);
        list.add(29);
        list.add(0);
        boolean verif = true;
        while (verif) {
            verif = false;
            for (int i = 0; i < (list.size() - 1); i++) {
                if (list.get(i) < list.get(i+1)) {
                    int temp = list.get(i);
                    list.remove(i);
                    list.add(i+1,temp);
                    verif=true;
                }
            }
        }
        System.out.println(list);
    }
}
