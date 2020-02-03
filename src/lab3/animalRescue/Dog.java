package lab3.animalRescue;

public class Dog {

    private String name;

    private String race;
    private float age;
    private String color;
    private int size;
    private boolean isFriendly;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(float age){
        this.age = age;
    }

    public float getAge(){
        return age;
    }


    public void run() {
        System.out.println("(tries to) Run all day!");
    }

    public void sleep() {
        System.out.println("zZZzzZZZ snore...");
    }

    public void eat() {
        System.out.println("Eating now a burger");
    }


}
