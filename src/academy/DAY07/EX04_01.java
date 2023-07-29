package academy.DAY07;

import java.util.Scanner;

class Person1 {
    String name = "펭수";
    int age = 20;

    public void setPerson(String name, int age) {
        name = name;
        age = age;
    }
}

public class EX04_01 {
    public static void main(String[] args) {
        Person1 per = new Person1();
        Scanner input = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = input.next();
        System.out.println("나이 입력 : ");
        int age = input.nextInt();
        per.setPerson(name, age);
        System.out.println("이름 : " + per.name);
        System.out.println("나이 : " + per.age);
        input.close();
    }
}
