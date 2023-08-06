package io;

import java.io.*;

public class EX03 {
    public static void main(String[] args) throws Exception{

        // JAVA System.out 은 표준 출력스트림 객체
        // printStream 객체의 참조값이 들어있음

        OutputStream outPut = System.out;

        // OutputStream 도 1byte 처리 스트림이다.

        outPut.write(65);
        outPut.write(66);
        outPut.write(67);
        // 출력은 flush 메소드를 호출해야 출력이 된다.
        // flus 버퍼에 저장된 값을 방출한다.
        outPut.flush();

        // 한글 가 의 유니코드값은 44032 인데 한글이 출력이 될까???
        // (불가능)
//        outPut.write(44032);
//        outPut.flush();

        // 올바르게 한글을 출력하려면 해당문자를 바이틉열로 변환 후 출력해야 한다.

        String str = "가";
        byte[] bytes = str.getBytes();

        outPut.write(bytes);
        outPut.flush();


    }
}
