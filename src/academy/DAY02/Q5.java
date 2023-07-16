package academy.DAY02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1번
        String ID, PS;


        System.out.print("ID를 입력하세요");
        ID = scanner.next();
        System.out.print("PS를 입력하세요");
        PS = scanner.next();

        System.out.println("==================");
        System.out.println("ID : " + ID);
        System.out.println("PS : " + PS);

        // -------------------------------------------------
        //  2번


        int first;


        System.out.print("출생년도 8자리 입력");
        first = scanner.nextInt();

        int y = first << 4;

        System.out.println(y);


        // -------------------------------------------------
        //  4번
        String in, h, m;

        System.out.print("진입시간 입력");
        in = scanner.next();


    }
}
