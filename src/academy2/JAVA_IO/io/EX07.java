package io;

import java.io.*;

public class EX07 {
    public static void main(String[] args) {

        //  Java PrintStream 과 PrintWriter는 출력스트림을 처리하는 클래스
        //  이 두 클래스는 각각 바이트기반 출력스트림과
        //  문자기반 출력스트림을 처리하기 위해 사용된다.

        //  PrintStream 객체 생성
        PrintStream ps = new PrintStream(System.out);

        //  기본자료형과 문자열을 출력할 수 있다.
        ps.print("Hello");
        ps.println(" World");
        ps.println(true);
        ps.println('귤');
        ps.println(3.14);

        //  ps.close(); // 스트림 닫기
    }
}
