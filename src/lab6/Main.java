package lab6;

import lab6.AnimalRescue.Animal;
import lab6.AnimalRescue.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Dog();
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(animal);
        System.out.println(list);

    }
}
