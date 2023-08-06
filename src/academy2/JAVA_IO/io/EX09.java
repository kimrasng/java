package io;

import java.io.*;

public class EX09 {
    public static void main(String[] args) throws Exception{

        InputStream input = System.in;
        
        //  2 ~ 9 까지 수 중 하나를 입력받아 해당 구구단 출력
        //  문자 2 ~ 9는 10진수 50부터 57

        System.out.print("수 를 입력하세요 : ");
        int code = input.read();

        int dan = code - 48;

        System.out.println("code : " + code);
        System.out.println("dan : " + dan);

        if (dan < 2 || dan > 9) {
            System.out.println("2부터 9사이의 숫자를 입력해주세요");
//            return; // 메소드 종료
            System.exit(0);  // 프로그램 종료
        }

        System.out.println("\t" + dan + "단 출력");

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d X %d = %d\n", dan, i, dan*i);
        }



    }
}
