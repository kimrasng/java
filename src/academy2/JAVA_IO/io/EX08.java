package io;

import java.io.*;

public class EX08 {
    public static void main(String[] args) throws Exception{


        //  new PrintWriter("파일경로")

        PrintWriter pw = new PrintWriter(System.out);

        //  문자열 출력
        pw.println("Hello World");
        pw.println("Welcome to Java World");

        pw.flush();

    }
}
