package lab4.animalRescue;

public class AppMain {

    public static void main(String[] args) {
//        Dog rex = new Dog();
//        rex.setName("Rex");
//        System.out.println(rex.getName());
//
//        rex.setAge(5);
//        System.out.println(rex.getAge());

//        rex.age = 5;
//        rex.race = "pug";
//        System.out.println(rex.age);
//
//        Dog brunno = new Dog();
//        brunno.name = "Brunno";
//        System.out.println(brunno.name);

//        Cat lizzie = new Cat();
//        lizzie.set
//
//
//        Dog ion = new Dog();
//        ion.sleep();

        Animal animal = new Animal();
        Dog dog = new Dog();

        Animal dog2 = new Dog();

        System.out.println("Animal class: ");
        animal.speak();

        System.out.println("Dog class: ");
        dog.speak();

        System.out.println("Animal and dog class: ");
        ((Animal) dog2).speak();
    }
}
