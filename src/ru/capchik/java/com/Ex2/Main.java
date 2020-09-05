package ru.capchik.java.com.Ex2;

public class Main {

    public static void main(String[] args) {
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public changeAge(int age){
        return age *= 7;
    }

}