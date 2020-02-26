package lab6;
import java.util.List;
public class LogicalOp {
//Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru sa fie o lista de numere,si celalalt
// un numar (real sau intreg).
// Metoda sa adauge numarul primit ca si parametru la final de lista.
    public void addValue(List<Integer> list, int number){
        list.add(number);
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou.
    public void printList(List<String> myList){
        for(int i = 0 ; i< myList.size();i++){
            System.out.println(myList.get(i));
        }
//        for(String element:myList){
//            System.out.println(element);
//        }
    }
}
