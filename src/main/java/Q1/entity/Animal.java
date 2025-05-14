package Q1.entity;

import Q1.exception.AgeLessThanZeroException;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (age < 0){
            throw new AgeLessThanZeroException();
        }

        this.name = name;
        this.age = age;
    }

    public void som(){
        System.out.println("Som de animal...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
