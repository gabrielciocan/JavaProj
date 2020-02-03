package lab3.animalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());

        rex.setAge(5);
        System.out.println(rex.getAge());

//        rex.age = 5;
//        rex.race = "pug";
//        System.out.println(rex.age);
//
//        Dog brunno = new Dog();
//        brunno.name = "Brunno";
//        System.out.println(brunno.name);


        Dog ion = new Dog();
        ion.sleep();
    }
}
