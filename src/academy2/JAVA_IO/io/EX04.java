package io;

import java.io.*;

public class EX04 {
    public static void main(String[] args) throws Exception{

        InputStream is = System.in;

        byte[] datas = new byte[100];
        //  길이가 100인 바이트 배열생성

        System.out.print("이름 : ");
        int nameLength = is.read(datas);
        //  입력한 데이터 byte 배열안으로 들어가고
        //  데이터의 길이를 정수로 변환해준다.

        String name = new String(datas, 0, nameLength);
        //  String 생성자로 datas 배열을 받아 문자열을 만들어준다.
        //  new String(byte배열, 시작인덱스, 길이)

        System.out.println(name);





        //  하고싶은 말을 read 메소드로 입력받아
        //  byte 배열에 저장 후 String 객체를 생성하여
        //  입력받은 말을 콘솔뷰에 출력하기

        System.out.print("하고 싶은 말 : ");
        int commentLength = is.read(datas);

        String comment = new String(datas, 0, commentLength-1);
        //  enter값 때문에 -1를 해준다


        System.out.println("입력 하고 싶은 말 : " + comment);


    }
}
