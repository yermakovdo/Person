package task.person;

import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;

    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " двигается");
    }

    public void talk(){
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args){
        Person person1 = new Person();
        Scanner in = new Scanner(System.in);
        String fullName = in.nextLine();
        int age = in.nextInt();
        person1.fullName = fullName;
        person1.age = age;
        person1.move();
        person1.talk();
        Person person2 = new Person(fullName, age);
        person2.move();
        person2.talk();
    }
}
