package academy.DAY07;

import java.util.Scanner;
class Final_01 {
    final String nation = "KOREA";
    String ssn = "000-0000";
    String name;
}
public class EX02_01 {
    public static void main(String[] args) {
        Final_01 person = new Final_01();
        Scanner input = new Scanner(System.in);
        System.out.print("이름 : ");
        person.name = input.next();
        System.out.print("주민번호 : ");
        person.ssn = input.next();
        input.close();
        System.out.print("국가 : " + person.nation);
        System.out.print("이름 : " + person.name);
        System.out.print("주민번호 : " + person.ssn);
    }
}
