package Q1.entity;

public class Cachorro extends Animal {
    public Cachorro(String name, int age) {
        super(name, age);
    }

    @Override
    public void som(){
        System.out.println("Au Au");
    }
}
