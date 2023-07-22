package academy.DAY05;

import java.util.Scanner;
class Student {
    String name;
    int age;
    String addr;
}
public class EX01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student s = new Student();

        System.out.print("이름, 나이, 주소 입력 : ");
        s.name = input.next();
        s.age = input.nextInt();
        s.addr = input.next();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.addr);

        input.close();
    }
}
