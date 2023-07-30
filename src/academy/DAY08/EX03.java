package academy.DAY08;

import java.util.Scanner;

class People {
//    private String name;
//    private String phone;

    protected String name;
    protected String phone;

    public People(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class Student extends People {
    private String serialNo;
    public Student(String name, String phone, String serialNo) {
        super(name, phone);
        this.serialNo = serialNo;
    }

    public void printStudent() {
        System.out.println("이름 : " + super.name);
        System.out.println("전화 : " + super.phone);
        System.out.println("학번 : " + this.serialNo);
    }
}

public class EX03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("이름/전화/학번 입력 : ");
        String name = input.next();
        String phone = input.next();
        String serialNo = input.next();
        Student st = new Student(name, phone, serialNo);
        st.printStudent();
        input.close();
    }
}
