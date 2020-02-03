import lab4.animalRescue.Cat;

import java.util.List;

public class Main {
    static class Dog extends Animal{
        Dog(){

        }
        Dog(int i){

        }
        public void speak(){
            System.out.println("Ham");
        }
        public int speak(int i){
            return i;
        }
    }
    static class Animal{
        public void speak(){
            System.out.println("Miau");
        }
    }

    public static void main(String[] args) {



    }




}
