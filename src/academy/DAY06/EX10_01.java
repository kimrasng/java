package academy.DAY06;

import java.util.Scanner;
class Student_EX10_01 {
    public String name;
    public int age;
    public String addr;
}

public class EX10_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student_EX10_01 s = new Student_EX10_01();
        System.out.print("이름 나이 주소 입력 : ");
        s.name = input.next();
        s.age = input.nextInt();
        s.addr = input.next();

        System.out.println("이름 : " + s.name);
        System.out.println("나이 : " + s.age);
        System.out.println("주소 : " + s.addr);
        input.close();
    }
}
