package academy.DAY06;

import java.util.Scanner;
class Student_EX10_02 {
    private String name;
    private int age;
    private String addr;
}

public class EX10_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EX10_04 s = new EX10_04();
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
