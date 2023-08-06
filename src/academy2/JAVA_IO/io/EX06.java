package io;

import java.io.*;

public class EX06 {
    public static void main(String[] args) throws Exception{

        InputStream is = System.in;
        //  1byte 처리 스트림

        //  InputStream 는 InputStream 보다 향상된 처리 스트림
        //  2byte를 처리할 수 있기 때문에 한글도 처리 가능하다.

        InputStreamReader isr = new InputStreamReader(is);

        System.out.print("문자 입력 : ");

        int code = isr.read();
        System.out.println("code : " + code);

        System.out.println("char : " + (char)code);

    }
}
