package session3;

public class Dog extends Animal{
    public int year;

    public Dog() {
    }

    public Dog(int id, String name, int year) {
        super(id, name);
        this.year = year;
    }

    public void eat(){
        super.run();
        System.out.println("Eat...");
    }

    public void run(){
        super.run();
        this.name = "abc";
        System.out.println("Dog run...");
    }
}
