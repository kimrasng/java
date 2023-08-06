package io;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  next : 공백전가찌 문자열을 읽어온다.
        //  nextInt : 공백전까지 정수를 읽어온다.
        //  nextDouble : 공백전까지 실수를 읽어온다.
        //  nextLine : 공백포함 통 문자열을 읽어온다.

        //  Scanner를 사용해서 아래 문자열을 입력 후
        //  nextLine 메소드를 통해 입력한 문자열을 읽어오기
        //  String 클래스의 getBytes 메소드를 통해 byte 배열로 변환 후
        //  모든 공백을 , 로 변환하여 출려하기
        
        //  문자열 : 홍길동 성춘향 이순신 이몽룡
        //  변환 후 문자열 : 홍길동,성춘형,이순신,이몽룡

        byte b = ' ';
        byte c = ',';

        System.out.print("문자열 입력 : ");
        String str = scan.nextLine();

        System.out.println("입력한 문자열 : " + str);

        byte[] byteArray = str.getBytes();

        for (int i = 0; i < byteArray.length; i ++) {
            if (byteArray[i] == ' ') {
                byteArray[i] = ',';
            }
        }

        String str2 = new String(byteArray);

        System.out.println("변환한 문자열 : " + str2);

        scan.close();

    }
}
