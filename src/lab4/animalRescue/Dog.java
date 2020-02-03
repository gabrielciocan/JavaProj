package lab4.animalRescue;

public class Dog extends Animal{


    private String race;
    private int size;
    private boolean isFriendly;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
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

    public void speak() {
        System.out.println("This dog is barking");
    }
}
