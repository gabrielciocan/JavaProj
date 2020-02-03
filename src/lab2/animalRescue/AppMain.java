package lab2.animalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age = 5;
        rex.race = "pug";
        System.out.println(rex.age);
        System.out.println(rex.name);

        Dog brunno = new Dog();
        brunno.name = "Brunno";
        System.out.println(brunno.name);


        Dog ion = new Dog();
        ion.sleep();
    }
}
