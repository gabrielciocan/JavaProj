package lab7;



public class LogicalOp {
    //5.In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void readArrayIndex(int[] array, int number){
        try{
            System.out.println(array[number]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch, number too large");
        }
    }
    //6. In clasa LogicalOp, creati o metoda  'wait()'.
    // Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int. In interiorul ei,
    // tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
    // Ex: wait(5) -> asteapta 5 secunde.
    public void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
