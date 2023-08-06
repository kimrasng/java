package practice;

import java.util.Scanner;

class Student {
    private int studentID;
    private String name;
    private int age;

    public Student(int studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EX03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("학번 입력: ");
        int studentID = input.nextInt();
        System.out.print("이름 입력: ");
        String name = input.next();
        System.out.print("나이 입력: ");
        int age = input.nextInt();

        Student student = new Student(studentID, name, age);

        System.out.println("입력한 학생정보 보기");
        System.out.println("학번: " + student.getStudentID());
        System.out.println("이름: " + student.getName());
        System.out.println("나이: " + student.getAge());
    }
}
