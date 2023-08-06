package io;

import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.io.*;

public class EX02 {
    public static void main(String[] args) throws Exception{

        //  컴퓨터의 키보드, 파일, 네트워크 등으로 입력을 하여
        //  컴퓨터의 메모리에 저장되면 콘솔, 파일, 네이트워크 등을 통해 출력한다.
        //  데이터들은 2진수로 이루어진 바이트로 전달이 되어진다.
        //  이러한 입출력을 실행시키기 위해서 java에서는 Stream이 사용된다.

        //  InputStream 은 1byte 단위 처리 스트림이다.
        //  영문자, 숫자, 특수문자 만 처리가능하다. (한글 처리X)

        InputStream input = System.in;
        //  System.in 은 표준 입력 스트림 객체이다.

        System.out.print("키코드 입력하고 엔터 : ");

        int keyCode = input.read();
        System.out.println((char)keyCode);
        //  코드값에 대응되는 문자 알아보기

        keyCode = input.read(); //  엔터값 읽어오기
        System.out.println(keyCode);

        keyCode = input.read(); //  엔터값 읽어오기
        System.out.println(keyCode);


    }
}
