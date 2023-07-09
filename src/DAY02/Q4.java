package DAY02;

import java.nio.file.LinkPermission;
import  java.util.Scanner;
public class Q4 {
    public static void main(String[] args) throws  Exception{
        Scanner scanner = new Scanner(System.in);
        String name;
        int korean, eng, math, total;

        System.out.print("당신의 이름은 무엇입니까?");
        name = scanner.next();

        System.out.print(name + "님의 국어 점수 : ");
        korean = scanner.nextInt();

        System.out.print(name + "님의 영어 점수 : ");
        eng = scanner.nextInt();

        System.out.print(name + "님의 수학 점수 : ");
        math = scanner.nextInt();

        total = korean + eng + math;

        System.out.println("================================");
        System.out.println("이 름 : " + name);
        System.out.println("================================");
        System.out.println("국 어 :" + korean);
        System.out.println("영 어 :" + eng);
        System.out.println("수 학 :" + math);
        System.out.println("================================");
        System.out.println("합 계 : " + total);
        System.out.println("================================");
        scanner.close();


    }
}
